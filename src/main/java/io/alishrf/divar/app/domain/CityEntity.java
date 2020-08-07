package io.alishrf.divar.app.domain;

import javax.persistence.*;

@Table(name = "city")
@Entity
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public CityEntity(String name) {
        this.name = name;
    }

    public CityEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
