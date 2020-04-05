package cn.liupengstudy.ordworld.pojo;

/**
 * @文件名 cn.liupengstudy.ordworld.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/5 - 11:44 上午
 * @修改人和其它信息
 */
public class FileException extends RuntimeException{
    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }
}
