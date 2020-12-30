package JavaBean;

public class fileReview {
    private Integer id;
    private String userName;
    private String movieName;
    private String info;

    public fileReview() {
    }

    public fileReview(Integer id, String userName, String movieName, String info) {
        this.id = id;
        this.userName = userName;
        this.movieName = movieName;
        this.info = info;
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

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "fileReview{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
