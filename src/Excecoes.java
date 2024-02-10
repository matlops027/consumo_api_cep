public abstract class Excecoes extends RuntimeException {
    String message;

    public Excecoes(String message) {
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
