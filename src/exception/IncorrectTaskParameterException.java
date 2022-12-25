package exception;

public class IncorrectTaskParameterException extends Exception {
    private final String parameter;

    public IncorrectTaskParameterException(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String getMessage() {
        return "Параметр " + parameter + " задан неверно!";
    }
}
