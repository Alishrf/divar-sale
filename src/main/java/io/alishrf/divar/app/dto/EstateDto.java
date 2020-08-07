package io.alishrf.divar.app.dto;

import io.alishrf.divar.app.domain.enums.AdvertisementType;

public class EstateDto {

    private String sector;

    private String city;

    private boolean isInstantaneous;

    private String category;

    private Long price;

    private boolean hasPrice;

    private String title;

    private String description;

    private AdvertisementType advertisementType;

    private Double area;

    private Integer yearOfConstruction;

    private String address;

    private boolean hasElevator;

    private boolean hasParking;

    private boolean isOfficial;

    private boolean hasWareHouse;

    private String type;

    private Integer numberOfRoom;


    public EstateDto(String sector, String city, boolean isInstantaneous, String category, Long price, boolean hasPrice, String title, String description, AdvertisementType advertisementType, Double area, Integer yearOfConstruction, String address, boolean hasElevator, boolean hasParking, boolean isOfficial, boolean hasWareHouse, String type, Integer numberOfRoom) {
        this.sector = sector;
        this.city = city;
        this.isInstantaneous = isInstantaneous;
        this.category = category;
        this.price = price;
        this.hasPrice = hasPrice;
        this.title = title;
        this.description = description;
        this.advertisementType = advertisementType;
        this.area = area;
        this.yearOfConstruction = yearOfConstruction;
        this.address = address;
        this.hasElevator = hasElevator;
        this.hasParking = hasParking;
        this.isOfficial = isOfficial;
        this.hasWareHouse = hasWareHouse;
        this.type = type;
        this.numberOfRoom = numberOfRoom;
    }

    public boolean isInstantaneous() {
        return isInstantaneous;
    }

    public void setInstantaneous(boolean instantaneous) {
        isInstantaneous = instantaneous;
    }

    public boolean isHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(boolean hasPrice) {
        this.hasPrice = hasPrice;
    }

    public Integer getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(Integer numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public EstateDto() {
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getInstantaneous() {
        return isInstantaneous;
    }

    public void setInstantaneous(Boolean instantaneous) {
        isInstantaneous = instantaneous;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }

    public boolean isHasWareHouse() {
        return hasWareHouse;
    }

    public void setHasWareHouse(boolean hasWareHouse) {
        this.hasWareHouse = hasWareHouse;
    }
}


