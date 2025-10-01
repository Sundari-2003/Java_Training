public class ExceptionPractice {
    public void validateEmail(String email) throws EmailValidateException {
        if(email.contains("@")) throw (new EmailValidateException("valid email"));
        else throw (new EmailValidateException("invalid email"));
    }
    
}
