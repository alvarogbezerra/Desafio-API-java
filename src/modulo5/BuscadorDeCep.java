package modulo5;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscadorDeCep {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o CEP que você deseja busca: ");
            var busca = leitura.nextLine();

        String endereco = "https://viacep.com.br/ws/" + busca.replace(" ", "+") + "/json/";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
                HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
    
                String json = response.body();
    
                Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
                
                CEP cepPesquisado = gson.fromJson(json, CEP.class);
                System.out.println(cepPesquisado.toString());

            } catch (Exception e) {
                System.out.println("Ocorreu algum erro na sua aplicação. ");
            }
}
}
