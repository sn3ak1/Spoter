package Credentials;

import Exceptions.LoginException;
import Exceptions.WrongEmailFormatException;

public class LoginController {

    boolean login(String user, String password) throws LoginException {return true;}

    boolean validateEmail(String email) throws WrongEmailFormatException {return true;}
}
