package consultorio.apiodontologia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import consultorio.apiodontologia.entity.Sexo;

@Repository
public interface SexosRepository extends JpaRepository<Sexo, Integer> {

}
