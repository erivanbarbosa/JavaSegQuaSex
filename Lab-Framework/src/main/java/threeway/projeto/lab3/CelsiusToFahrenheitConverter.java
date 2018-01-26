package threeway.projeto.lab3;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("celsiusToFahrenheitConverter")
public class CelsiusToFahrenheitConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		Float resultado = 0F;

		try {
			Float celsius = Float.parseFloat(value);
			resultado = (celsius * 9 / 5) + 32;
		} catch (Exception e) {
			FacesMessage msg = new FacesMessage(
					"Erro de Convers�o em celsiusToFahrenheitConverter",
					"Entradainv�lida, tente novamente.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			
			throw new ConverterException();
		}
		
		return resultado;

	}

	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		// TODO Auto-generated method stub
		return value.toString();
	}

}
