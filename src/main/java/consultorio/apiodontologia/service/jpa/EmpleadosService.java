package consultorio.apiodontologia.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import consultorio.apiodontologia.entity.Empleado;
import consultorio.apiodontologia.repository.EmpleadosRepository;
import consultorio.apiodontologia.service.IEmpleadosService;

@Service
public class EmpleadosService implements IEmpleadosService {

	@Autowired
	private EmpleadosRepository repoEmpleados;
	
	//@Override
	public List<Empleado> buscarHabilitados() {

		return repoEmpleados.findByHabilitado(1);
	}
	
	@Override
	public List<Empleado> buscarDesabilitado() {
		
		return repoEmpleados.findByHabilitado(0);
	}
	
	@Override
	public void guardar(Empleado empleado) {
		repoEmpleados.save(empleado);
		
	}

	@Override
	public Optional<Empleado> buscarId(int idEmpleado) {

		return repoEmpleados.findById(idEmpleado);
	}

	/*@Override
	public Optional<Empleado> buscarHabilitadoYIdEmpleado(int habilitado, int idEmpleado) {
		
		return repoEmpleados.findByHabilitadoAndId(1, idEmpleado);
	}*/


}
