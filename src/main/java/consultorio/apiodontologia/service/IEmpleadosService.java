package consultorio.apiodontologia.service;

import java.util.List;
import consultorio.apiodontologia.entity.Empleado;

public interface IEmpleadosService {

	List<Empleado> buscarHabilitados();
}
