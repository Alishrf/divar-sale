package io.alishrf.divar.app.dto;

import io.alishrf.divar.app.domain.enums.AdvertisementType;

public class CarDto {

    private String sector;

    private String city;

    private boolean isInstantaneous;

    private String category;

    private Long price;

    private boolean hasPrice;

    private String title;

    private String description;

    private AdvertisementType advertisementType;

    private Integer year;


    private Long carOperation;

    private boolean isResidential;

    private boolean isExchange;

    private boolean isOnSale;

    private boolean isFree;

    private String type;

    private String brand;

    private String address;

    public CarDto(String sector, String city, boolean isInstantaneous, String category, Long price, boolean hasPrice, String title, String description, AdvertisementType advertisementType, Integer year, Long carOperation, boolean isResidential, boolean isExchange, boolean isOnSale, boolean isFree, String type, String brand, String address) {
        this.sector = sector;
        this.city = city;
        this.isInstantaneous = isInstantaneous;
        this.category = category;
        this.price = price;
        this.hasPrice = hasPrice;
        this.title = title;
        this.description = description;
        this.advertisementType = advertisementType;
        this.year = year;
        this.carOperation = carOperation;
        this.isResidential = isResidential;
        this.isExchange = isExchange;
        this.isOnSale = isOnSale;
        this.isFree = isFree;
        this.type = type;
        this.brand = brand;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isInstantaneous() {
        return isInstantaneous;
    }

    public void setInstantaneous(boolean instantaneous) {
        isInstantaneous = instantaneous;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public boolean isHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdvertisementType getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(AdvertisementType advertisementType) {
        this.advertisementType = advertisementType;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
