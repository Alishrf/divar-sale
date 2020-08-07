package io.alishrf.divar.app.repository;

import io.alishrf.divar.app.domain.AdvertisementEntity;
import io.alishrf.divar.app.domain.CarEntity;
import io.alishrf.divar.app.domain.EstateEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstateRepository extends JpaRepository<EstateEntity,Long> {
    @Query("select e.advertisement from EstateEntity e")
    Page<AdvertisementEntity> findAdvertisements(Pageable pageable);
}
