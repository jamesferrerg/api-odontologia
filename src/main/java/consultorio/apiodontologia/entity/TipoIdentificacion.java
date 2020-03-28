package consultorio.apiodontologia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TiposIdentificacion")
public class TipoIdentificacion {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTipoIdentificacion;
	private String tipoIdentificacion;
	private String habilitado;

	public Integer getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	
	@Override
	public String toString() {
		return "TipoIdentificacion [idTipoIdentificacion=" + idTipoIdentificacion + ", tipoIdentificacion="
				+ tipoIdentificacion + ", habilitado=" + habilitado +"]";
	}
}
