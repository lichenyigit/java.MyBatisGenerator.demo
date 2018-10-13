package myBatisGenerator.demo.domain;

public class FavoriteList {
    private Integer id;

    private String avatar;

    private String userName;

    private String relationModelUrl;

    private Float scaleX;

    private Float scaleY;

    private Float scaleZ;

    private Integer active;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRelationModelUrl() {
        return relationModelUrl;
    }

    public void setRelationModelUrl(String relationModelUrl) {
        this.relationModelUrl = relationModelUrl == null ? null : relationModelUrl.trim();
    }

    public Float getScaleX() {
        return scaleX;
    }

    public void setScaleX(Float scaleX) {
        this.scaleX = scaleX;
    }

    public Float getScaleY() {
        return scaleY;
    }

    public void setScaleY(Float scaleY) {
        this.scaleY = scaleY;
    }

    public Float getScaleZ() {
        return scaleZ;
    }

    public void setScaleZ(Float scaleZ) {
        this.scaleZ = scaleZ;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}