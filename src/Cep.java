public class Cep {
    private String cep;

    public Cep(String cepDigitado) {
        setCep(cepDigitado);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(validaCep(cep)) {
            this.cep = cep;
        }else {
            throw new InvalidCepException("CEP digitado está inválido!");
        }
    }

    private boolean validaCep(String cepDigitado) {
        return cepDigitado.length() == 8;
    }
}
