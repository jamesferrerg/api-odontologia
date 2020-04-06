package consultorio.apiodontologia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//@GetMapping("/noEmpleados")
	public List<Empleado> buscarDesabilitado(){ 
		return serviceEmpleados.buscarDesabilitado();
	}
	
	@GetMapping("/empleados/{idEmpleado}")
	public Optional<Empleado> buscarId(@PathVariable int idEmpleado, Empleado empleado){ 
		

		//Optional<Empleado> oEmpleado = serviceEmpleados.buscarId(idEmpleado);
		try	{
			for (Empleado oEmpleado2 : buscarDesabilitado()){ 
				if (oEmpleado2.getIdEmpleado() == idEmpleado){ 
					
					throw new RuntimeException();
				}
			}
			
			for (Empleado oEmpleado2 : buscarHabilitados()){ 
				if (oEmpleado2.getIdEmpleado() == idEmpleado){ 
					return serviceEmpleados.buscarId(idEmpleado);
				}
			}
		} catch (Exception ex) { 
			throw new RuntimeException("Empleado desabilitado o eliminado con id No. "+idEmpleado, ex);
		}
		
		throw new RuntimeException("empleado con id No. "+idEmpleado+" no existe");
		
	}
	
	/*@GetMapping("/empleados/{idEmpleado}")
	public Optional<Empleado> buscarHabilitadoYIdEmpleado(@PathVariable int idEmpleado){ 
		
		return serviceEmpleados.buscarHabilitadoYIdEmpleado(1, idEmpleado);
		
	}*/
	
	
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
	
	@PutMapping("/empleados/eliminar/{id}")
	public String eliminarPorDesabilitado(@PathVariable("id") int idEmpleado){ 
		
		try {
			for (Empleado oEmpleado : buscarHabilitados()){ 
				if (oEmpleado.getIdEmpleado() == idEmpleado){ 
					oEmpleado.setHabilitado(0);
					serviceEmpleados.guardar(oEmpleado);
					return "Empleado eliminado";
				}
			}
			return "empleado inexistente";
			
		} catch (Exception ex) {
			return "No es posible eliminar al empleado";
		}
		
	}
}
