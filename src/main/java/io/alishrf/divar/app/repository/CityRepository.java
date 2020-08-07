package io.alishrf.divar.app.repository;

import io.alishrf.divar.app.domain.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityEntity,Long> {
}
