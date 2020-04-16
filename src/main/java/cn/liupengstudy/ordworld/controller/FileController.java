package cn.liupengstudy.ordworld.controller;



import cn.liupengstudy.ordworld.entity.Filename;
import cn.liupengstudy.ordworld.entity.tools.LPR;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cn.liupengstudy.ordworld.service.impl.FileService;
import cn.liupengstudy.ordworld.entity.UploadFileResponse;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @文件名 cn.liupengstudy.ordworld.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/5 - 11:41 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/File")
@Api(tags = "文件控制器")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Autowired
    private FileService fileService;
    @Autowired
    private FilenameController filenameController;

    //@PostMapping("/uploadFile")
    @ApiOperation(value = "单文件上传")
    @RequestMapping(path = "/uploadFile", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public LPR uploadFile(@RequestParam("file") MultipartFile file){
        LPR lpr = new LPR();
        lpr.setWhat("单文件上传");
        boolean key = true;

        // 获取文件名称
        String name = StringUtils.cleanPath(file.getOriginalFilename());

        Filename filename = new Filename();
        filename.setFilename(name);

        System.out.println("filename.toString(): " + filename.toString());

        LPR addFileNamelpr = filenameController.add(filename);

        if (addFileNamelpr.isReturnKey()) {
            String fileName = fileService.storeFile(file);
            String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/File/downloadFile/").toUriString();
            fileDownloadUri = fileDownloadUri + fileName;
            UploadFileResponse uploadFileResponse = new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
            lpr.setReturnObject(uploadFileResponse);
        } else {
            key = false;
            lpr.setWhy(addFileNamelpr.getWhy());
        }
        lpr.setReturnKey(key);
        return lpr;
    }

    //@PostMapping("/uploadMultipleFiles")
    /*@ApiOperation(value = "多文件上传")
    @RequestMapping(path = "/uploadMultipleFilese", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.stream(files).map(this::uploadFile).collect(Collectors.toList());
    }*/

    //@GetMapping("/downloadFile/{fileName:.+}")
    @ApiOperation(value = "文件下载")
    @RequestMapping(path = "/downloadFile/{fileName:.+}", method = {RequestMethod.POST,RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}

