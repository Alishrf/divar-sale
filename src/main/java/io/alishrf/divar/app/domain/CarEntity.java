package io.alishrf.divar.app.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
public class CarEntity extends VehicleEntity {
}
