package ar.edu.utn.frc.tup.lciii.repositories;

import ar.edu.utn.frc.tup.lciii.dtos.DummyDto;
import ar.edu.utn.frc.tup.lciii.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {

}
