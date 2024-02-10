import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public record Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge) {
    public void serializer() throws IOException {
        Gson gson = new Gson();
        FileWriter file = new FileWriter("saidaEnderecoJson.json");
        file.write(gson.toJson(this));
        file.close();
    }

    @Override
    public String toString() {
        return
            "cep='" + cep + '\'' +
            ", logradouro='" + logradouro + '\'' +
            ", bairro='" + bairro + '\'' +
            ", localidade='" + localidade + '\'' +
            ", uf='" + uf + '\'';
    }
}
