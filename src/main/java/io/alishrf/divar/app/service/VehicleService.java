package io.alishrf.divar.app.service;



import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.CarEntity;
import io.alishrf.divar.app.domain.HeavyVehicleEntity;
import io.alishrf.divar.app.domain.VehicleEntity;
import io.alishrf.divar.app.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;


    public Page<AdvertisementEntity> findAdvertisements(Pageable pageable){
        return repository.findAdvertisements(pageable);
    }



    public VehicleEntity save(CarEntity carEntity){
        return repository.save(carEntity);
    }
    public VehicleEntity save(HeavyVehicleEntity heavyVehicleEntity){
        return repository.save(heavyVehicleEntity);
    }
}
