package io.alishrf.divar.app.domain;


import io.alishrf.divar.app.domain.enums.AdvertisementType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "advertisement")
public class AdvertisementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sector_id")
    private SectorEntity sectorEntity;

    @Column(name = "is_instantaneous")
    private Boolean isInstantaneous;

    @Type(type = "yes_no")
    @Column(name = "has_price")
    private Boolean hasPrice;

    @Column(name = "price")
    private Long price;

    @Column(name = "numberOfPicture")
    private Integer numberOfPicture;

    @Column(name = "img")
    private String img;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    @Column(name = "is_expired")
    private Boolean isExpired;

    @Column(name = "expired_date")
    private Date expireDate;

    @Column(name = "category")
    private Date category;


    @Column(name ="ad_type" )
    @Enumerated(EnumType.ORDINAL)
    private AdvertisementType advertisementType;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SectorEntity getSectorEntity() {
        return sectorEntity;
    }

    public void setSectorEntity(SectorEntity sectorEntity) {
        this.sectorEntity = sectorEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getInstantaneous() {
        return isInstantaneous;
    }

    public void setInstantaneous(Boolean instantaneous) {
        isInstantaneous = instantaneous;
    }

    public Boolean getHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(Boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNumberOfPicture() {
        return numberOfPicture;
    }

    public void setNumberOfPicture(Integer numberOfPicture) {
        this.numberOfPicture = numberOfPicture;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public AdvertisementType getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(AdvertisementType advertisementType) {
        this.advertisementType = advertisementType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
