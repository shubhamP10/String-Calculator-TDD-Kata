package exception;

public class NegativeNumbersNotAllowedException extends RuntimeException {
    public NegativeNumbersNotAllowedException(StringBuilder negatives) {
        super("Negative Numbers not Allowed: "+ negatives);
    }
}
