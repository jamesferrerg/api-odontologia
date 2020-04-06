package consultorio.apiodontologia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import consultorio.apiodontologia.entity.Empleado;

public interface EmpleadosRepository extends JpaRepository<Empleado, Integer> {
	
	List<Empleado> findByHabilitado (Integer habilitado);
	/*Optional<Empleado> findByHabilitadoAndId (int habilitado, int idEmpleado);*/
	
}
