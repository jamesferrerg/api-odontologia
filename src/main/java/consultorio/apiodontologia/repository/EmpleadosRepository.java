package consultorio.apiodontologia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import consultorio.apiodontologia.entity.Empleado;

public interface EmpleadosRepository extends JpaRepository<Empleado, Integer> {
	
	List<Empleado> findByHabilitado (Integer habilitado);
}
