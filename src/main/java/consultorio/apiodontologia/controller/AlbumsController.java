package consultorio.apiodontologia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consultorio.apiodontologia.entity.Empleado;
import consultorio.apiodontologia.service.IEmpleadosService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	@Autowired
	private IEmpleadosService serviceEmpleados;
	
	@GetMapping("/empleados")
	public List<Empleado> buscarHabilitados(){
		return serviceEmpleados.buscarHabilitados();
	}
}
