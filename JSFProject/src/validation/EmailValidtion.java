package validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class EmailValidtion implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object emailObj) throws ValidatorException {
		
		if (emailObj != null) {
			String email = emailObj.toString();
			if (email.length() == 0 || !email.contains("@")) {
				FacesMessage msg = new FacesMessage(" Invaled Date.");
				throw new ValidatorException(msg);
			}
			
		}
		
	}

}
