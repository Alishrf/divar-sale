package io.alishrf.divar.app.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("S")
@Entity
public class SaleEstateEntity extends EstateEntity {

}
