package cn.liupengstudy.ordworld.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "管理员")
public class Conservator implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conservator.id
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "ID")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conservator.imageURL
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "头像URL")
    private String imageurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conservator.name
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conservator.password
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "密码")
    private Integer password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conservator.phoneNumber
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "联系方式")
    private String phonenumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @ApiModelProperty(value = "serialVersionUID")
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conservator.id
     *
     * @return the value of conservator.id
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conservator.id
     *
     * @param id the value for conservator.id
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conservator.imageURL
     *
     * @return the value of conservator.imageURL
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conservator.imageURL
     *
     * @param imageurl the value for conservator.imageURL
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conservator.name
     *
     * @return the value of conservator.name
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conservator.name
     *
     * @param name the value for conservator.name
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conservator.password
     *
     * @return the value of conservator.password
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conservator.password
     *
     * @param password the value for conservator.password
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public void setPassword(Integer password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conservator.phoneNumber
     *
     * @return the value of conservator.phoneNumber
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conservator.phoneNumber
     *
     * @param phonenumber the value for conservator.phoneNumber
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conservator
     *
     * @mbg.generated Tue Apr 07 18:13:39 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append("]");
        return sb.toString();
    }
}