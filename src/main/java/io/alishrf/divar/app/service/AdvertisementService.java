package io.alishrf.divar.app.service;

import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {


    @Autowired
    private AdvertisementRepository repository;


    public Page<AdvertisementEntity> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public List<AdvertisementEntity> findByUser(Long userId){
        return repository.findByUser(userId);
    }
    public void save(AdvertisementEntity advertisementEntity){
        repository.save(advertisementEntity);
    }
}
