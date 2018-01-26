package threeway.projeto.lab3;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean( name = "conversoresBean")
@ViewScoped
public class Conversores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -294448466433832422L;

	
	private Date dataNascimento;
	private Integer peso;
	private String CelsiusToFahrenheit;
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public String getCelsiusToFahrenheit() {
		return CelsiusToFahrenheit;
	}
	public void setCelsiusToFahrenheit(String celsiusToFahrenheit) {
		CelsiusToFahrenheit = celsiusToFahrenheit;
	}
	
	
}
