package io.alishrf.divar.app.repository;


import io.alishrf.divar.app.domain.AdvertisementEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<AdvertisementEntity,Long> {

    @Query("select a from AdvertisementEntity a where  a.isExpired = false ")
    Page<AdvertisementEntity> findAll(Pageable pageable);

    @Query("select a from AdvertisementEntity a where  a.isExpired = false and a.user.id = :uid" )
    List<AdvertisementEntity> findByUser(@Param("uid")Long uid);
}
