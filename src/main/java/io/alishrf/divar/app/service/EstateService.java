package io.alishrf.divar.app.service;


import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.EstateEntity;
import io.alishrf.divar.app.domain.RentalEstateEntity;
import io.alishrf.divar.app.domain.SaleEstateEntity;
import io.alishrf.divar.app.repository.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EstateService {

    @Autowired
    private EstateRepository repository;


    public Page<AdvertisementEntity> findAdvertisements(Pageable pageable){
        return repository.findAdvertisements(pageable);
    }


    public EstateEntity save(RentalEstateEntity rentalEstateEntity){
        return repository.save(rentalEstateEntity);
    }
    public EstateEntity save(SaleEstateEntity saleEstateEntity){
        return repository.save(saleEstateEntity);
    }


}
