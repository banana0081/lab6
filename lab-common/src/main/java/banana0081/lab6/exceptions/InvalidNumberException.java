package banana0081.lab6.exceptions;
/**
 * thrown when number is incorrect
 */
public class InvalidNumberException extends InvalidDataException {
    public InvalidNumberException(){
        super("invalid number format");
    }
    public InvalidNumberException(String msg){
        super(msg);
    }
}
