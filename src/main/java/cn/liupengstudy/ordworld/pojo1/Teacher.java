package cn.liupengstudy.ordworld.pojo1;

import java.io.Serializable;

public class Teacher implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.imageURL
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private String imageurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacherNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private String teachernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.password
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private Integer password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.phoneNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private String phonenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.professionalId
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private String professionalid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.isDelete
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private Integer isdelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table teacher
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.imageURL
     *
     * @return the value of teacher.imageURL
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.imageURL
     *
     * @param imageurl the value for teacher.imageURL
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacherNumber
     *
     * @return the value of teacher.teacherNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public String getTeachernumber() {
        return teachernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacherNumber
     *
     * @param teachernumber the value for teacher.teacherNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber == null ? null : teachernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.password
     *
     * @return the value of teacher.password
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.password
     *
     * @param password the value for teacher.password
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setPassword(Integer password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.phoneNumber
     *
     * @return the value of teacher.phoneNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.phoneNumber
     *
     * @param phonenumber the value for teacher.phoneNumber
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.professionalId
     *
     * @return the value of teacher.professionalId
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public String getProfessionalid() {
        return professionalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.professionalId
     *
     * @param professionalid the value for teacher.professionalId
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setProfessionalid(String professionalid) {
        this.professionalid = professionalid == null ? null : professionalid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.isDelete
     *
     * @return the value of teacher.isDelete
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.isDelete
     *
     * @param isdelete the value for teacher.isDelete
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Wed Apr 08 22:51:41 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", imageurl=").append(imageurl);
        sb.append(", teachernumber=").append(teachernumber);
        sb.append(", password=").append(password);
        sb.append(", phonenumber=").append(phonenumber);
        sb.append(", professionalid=").append(professionalid);
        sb.append(", isdelete=").append(isdelete);
        sb.append("]");
        return sb.toString();
    }
}