package consultorio.apiodontologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import consultorio.apiodontologia.entity.Empleado;
import consultorio.apiodontologia.service.IEmpleadosService;

@RestController
@RequestMapping("/api")
public class EmpleadosController {

	@Autowired
	private IEmpleadosService serviceEmpleados;
	
	@GetMapping("/empleados")
	public List<Empleado> buscarHabilitados(){
		return serviceEmpleados.buscarHabilitados();
	}
	
	@PostMapping("/empleados")
	public Empleado guardar(@RequestBody Empleado empleado) {
		
		empleado.setHabilitado(1);
		serviceEmpleados.guardar(empleado);
		return empleado;
	}
	
	@PutMapping("/empleados")
	public Empleado modificar(@RequestBody Empleado empleado){ 
		serviceEmpleados.guardar(empleado);
		return empleado;
	}
}
