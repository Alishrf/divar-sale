package io.alishrf.divar.app.domain;


import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator",discriminatorType = DiscriminatorType.STRING)
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advertisement_id")
    private AdvertisementEntity advertisement;

    private Integer year;

    @Column(name = "car_operation")
    private Long carOperation;

    @Column(name = "is_residential")
    private boolean isResidential;

    @Column(name = "is_exchange")
    private boolean isExchange;

    @Column(name = "isOnSale")
    private boolean isOnSale;

    @Column(name = "is_free")
    private boolean isFree;

    @Column(name = "brand")
    private String brand;

    @Column(name = "address")
    @Type(type = "org.hibernate.type.TextType")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AdvertisementEntity getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(AdvertisementEntity advertisement) {
        this.advertisement = advertisement;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Long getCarOperation() {
        return carOperation;
    }

    public void setCarOperation(Long carOperation) {
        this.carOperation = carOperation;
    }

    public boolean isResidential() {
        return isResidential;
    }

    public void setResidential(boolean residential) {
        isResidential = residential;
    }

    public boolean isExchange() {
        return isExchange;
    }

    public void setExchange(boolean exchange) {
        isExchange = exchange;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
