package io.alishrf.divar.app.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("H")
public class HeavyVehicleEntity extends VehicleEntity {


}
