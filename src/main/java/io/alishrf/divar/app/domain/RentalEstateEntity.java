package io.alishrf.divar.app.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("R")
@Entity
public class RentalEstateEntity extends EstateEntity {
}
