package io.alishrf.divar.app.domain;


import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "estate")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator",discriminatorType = DiscriminatorType.STRING)
public class EstateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "advertisement_id")
    private AdvertisementEntity advertisement;

    @Column(name = "area")
    private Double area;

    @Column(name = "year_of_construction")
    private Integer yearOfConstruction;

    @Column(name = "number_of_room")
    private Integer numberOfRoom;

    @Column(name = "address")
    @Type(type = "org.hibernate.type.TextType")
    private String address;

    @Column(name = "has_elevator")
    @Type(type = "yes_no")
    private boolean hasElevator;

    @Column(name = "has_parking")
    @Type(type = "yes_no")
    private boolean hasParking;

    @Column(name = "is_official")
    @Type(type = "yes_no")
    private boolean isOfficial;


    @Column(name = "has_wareHouse")
    @Type(type = "yes_no")
    private boolean hasWareHouse;

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

    public boolean isHasWareHouse() {
        return hasWareHouse;
    }

    public void setHasWareHouse(boolean hasWareHouse) {
        this.hasWareHouse = hasWareHouse;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }

    public Integer getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(Integer numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }
}
