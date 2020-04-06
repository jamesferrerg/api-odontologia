package consultorio.apiodontologia.service;

import java.util.List;
import java.util.Optional;

import consultorio.apiodontologia.entity.Empleado;

public interface IEmpleadosService {

	List<Empleado> buscarHabilitados();
	List<Empleado> buscarDesabilitado();
	void guardar(Empleado empleado);
	Optional<Empleado> buscarId(int idEmpleado);
	//Este es el metodo que busca por habilitado y idEmpleado
	//Optional<Empleado> buscarHabilitadoYIdEmpleado(int habilitado, int idEmpleado);
}
