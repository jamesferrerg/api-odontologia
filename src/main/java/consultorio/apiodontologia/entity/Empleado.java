package consultorio.apiodontologia.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Empleados")
public class Empleado {

	@Id
	// Con la declaracion de generatedValue se le dice que ira en autoincremento
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEmpleado;
	// La validacion de la cantidad de caracteres como el valor si es null o no
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	private String apellido;
	private String direccion;
	private String barrio;
	private Integer telefono;
	private String celular;
	private String numeroIdentificacion;
	private String email;
	private Date fechaContrato;
	private Integer tieneUsuario;
	private Integer habilitado;
	// La relacion de la tabla
	@OneToOne
	@JoinColumn(name = "idSexo")
	// Se declara un tipo de dato como objeto para el atributo de la llave foranea
	private Sexo idSexo;
	@OneToOne
	@JoinColumn(name = "idTipoIdentificacion")
	private TipoIdentificacion idTipoIdentificacion;
	@OneToOne
	@JoinColumn(name = "idTipoUsuario")
	private TipoUsuario idTipoUsuario;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public Integer getTieneUsuario() {
		return tieneUsuario;
	}

	public void setTieneUsuario(Integer tieneUsuario) {
		this.tieneUsuario = tieneUsuario;
	}

	public Integer getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}

	public Sexo getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Sexo idSexo) {
		this.idSexo = idSexo;
	}

	public TipoIdentificacion getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	public TipoUsuario getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", barrio=" + barrio + ", telefono=" + telefono + ", celular=" + celular
				+ ", numeroIdentificacion=" + numeroIdentificacion + ", email=" + email + ", fechaContrato="
				+ fechaContrato + ", tieneUsuario=" + tieneUsuario + ", habilitado=" + habilitado + ", idSexo=" + idSexo
				+ ", idTipoIdentificacion=" + idTipoIdentificacion + ", idTipoUsuario=" + idTipoUsuario + "]";
	}

}
