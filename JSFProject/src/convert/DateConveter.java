package convert;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

public class DateConveter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String strDate) {
		if(strDate != null && strDate.length() >0 && strDate.matches("\\d+-\\d+-\\d+")) {
			String[]strArr = strDate.split("-");
			Date date = new Date(Integer.parseInt(strArr[2]),Integer.parseInt(strArr[1]) , Integer.parseInt(strArr[0]));
			return date;
			
		}else {
			FacesMessage msg = new FacesMessage(" Invaled Date.");
			throw new ConverterException(msg);
		}
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object objDate) {
		
		if (objDate != null) {
			Date date = (Date)objDate;
			String strDate = date.toString();
			return strDate;
		}else {
			FacesMessage msg = new FacesMessage(" Invaled Date.");
			throw new ConverterException(msg);
		}
	}

}
