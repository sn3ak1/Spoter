package Credentials;

import Exceptions.PasswordRequeirementsException;
import Exceptions.RegisterException;
import Exceptions.WrongEmailFormatException;

public class RegistrationController {

    boolean register(String user, String password) throws RegisterException {return true;}

    boolean validateEmail(String email) throws WrongEmailFormatException {return true;}

    boolean validatePassword(String password) throws PasswordRequeirementsException {return true;}
}
