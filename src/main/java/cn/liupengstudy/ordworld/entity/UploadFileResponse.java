package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/5 - 11:44 上午
 * @修改人和其它信息
 */
@ApiModel(value = "上传文件模型")
public class UploadFileResponse {

    @ApiModelProperty(value = "文件名称")
    private String fileName;

    @ApiModelProperty(value = "下载地址")
    private String fileDownloadUri;

    @ApiModelProperty(value = "文件类型")
    private String fileType;

    @ApiModelProperty(value = "大小")
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
