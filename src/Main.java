import com.google.gson.Gson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        try {
            while (opcao != 1) {
                System.out.println("Digite um cep para pesquisar: ");
                Cep cepDigitado = new Cep(leitura.next());

                ConsumoAPI consumirApi = new BuscaCEP();
                String responseApi = consumirApi.get(cepDigitado.getCep());

                Gson gson = new Gson();
                Endereco endereco = gson.fromJson(responseApi, Endereco.class);

                System.out.println("Resultado: ");
                System.out.println("Endereço object: " + endereco);

                endereco.serializer();

                System.out.println("Consulta concluida! Aperta 1 para sair e 0 para continuar");
                opcao = leitura.nextInt();
            }
        }catch (InvalidCepException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}