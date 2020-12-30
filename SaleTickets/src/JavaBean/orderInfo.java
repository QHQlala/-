package JavaBean;

import java.util.Date;

public class orderInfo {
    private Integer id;
    private String userName;
    private Date time;
    private Integer num;
    private Integer allCount;
    private String fileName;
    private String showName;
    private String message;

    public orderInfo() {
    }

    public orderInfo(Integer id, String userName, Date time, Integer num, Integer allCount, String fileName, String showName, String message) {
        this.id = id;
        this.userName = userName;
        this.time = time;
        this.num = num;
        this.allCount = allCount;
        this.fileName = fileName;
        this.showName = showName;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAllCount() {
        return allCount;
    }

    public void setAllCount(Integer allCount) {
        this.allCount = allCount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "orderInfo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", time=" + time +
                ", num=" + num +
                ", allCount=" + allCount +
                ", fileName='" + fileName + '\'' +
                ", showName='" + showName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
