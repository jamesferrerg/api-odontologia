package consultorio.apiodontologia.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public void guardar(Empleado empleado) {
		repoEmpleados.save(empleado);
		
	}

}
