package cn.liupengstudy.ordworld.entity.tools;

import cn.liupengstudy.ordworld.entity.Chat;
import cn.liupengstudy.ordworld.entity.Student;
import cn.liupengstudy.ordworld.entity.Teacher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.ordworld.entity.tools
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/4/28 - 9:16 下午
 * @修改人和其它信息
 */
@ApiModel(value = "聊天信息数据")
public class LiuPengChatdata {

    @ApiModelProperty(value = "发言人类型")
    private Integer autorchType;

    @ApiModelProperty(value = "发言人数据")
    private Object object;


    @ApiModelProperty(value = "发言数据")
    private Chat chat;

    public LiuPengChatdata() {
    }

    public LiuPengChatdata(Integer autorchType, Object object, Chat chat) {
        this.autorchType = autorchType;
        this.object = object;
        this.chat = chat;
    }

    public Integer getAutorchType() {
        return autorchType;
    }

    public void setAutorchType(Integer autorchType) {
        this.autorchType = autorchType;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LiuPengChatdata{");
        sb.append("autorchType=").append(autorchType);
        sb.append(", object=").append(object);
        sb.append(", chat=").append(chat);
        sb.append('}');
        return sb.toString();
    }
}
