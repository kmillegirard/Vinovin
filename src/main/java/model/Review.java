package model;

public class Review {
    private String id;
    private String description;
    private int points;
    private Float price;
    private String province;
    private String region_1;
    private String region_2;
    private String variety;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion_1() {
        return region_1;
    }

    public void setRegion_1(String region_1) {
        this.region_1 = region_1;
    }

    public String getRegion_2() {
        return region_2;
    }

    public void setRegion_2(String region_2) {
        this.region_2 = region_2;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
