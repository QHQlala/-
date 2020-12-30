package JavaBean;

public class fileInfo {
    private Integer id;
    private Integer price;
    private String type;
    private String name;
    private String intro;
    private Integer count;
    private String photo;

    public fileInfo() {
    }

    public fileInfo(Integer id, Integer price, String type, String name, String intro, Integer count, String photo) {
        this.id = id;
        this.price = price;
        this.type = type;
        this.name = name;
        this.intro = intro;
        this.count = count;
        this.photo = photo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", count=" + count +
                ", photo='" + photo + '\'' +
                '}';
    }
}
