package io.alishrf.divar.app.repository;


import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.VehicleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity,Long> {
    @Query("select v.advertisement from VehicleEntity v")
    Page<AdvertisementEntity> findAdvertisements(Pageable pageable);

}
