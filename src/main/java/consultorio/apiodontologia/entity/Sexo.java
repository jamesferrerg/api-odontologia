package consultorio.apiodontologia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sexos")
public class Sexo {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idSexo;
	private String sexo;
	private Integer habilitado;
	
	
	public Integer getIdSexo() {
		return idSexo;
	}
	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(Integer habilitado) {
		this.habilitado = habilitado;
	}
	
	@Override
	public String toString() {
		return "Sexo [idSexo=" + idSexo + ", sexo=" + sexo + ", habilitado=" + habilitado +"]";
	}
}
