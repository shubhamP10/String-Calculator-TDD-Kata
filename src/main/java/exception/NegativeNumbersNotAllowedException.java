package exception;

public class NegativeNumbersNotAllowedException extends RuntimeException {
    public NegativeNumbersNotAllowedException() {
        super("Negative Numbers not Allowed");
    }
}
