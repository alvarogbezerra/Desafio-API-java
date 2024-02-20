import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscadorDePessoas {
    public static void main(String[] args) throws Exception {
        String endereco = "https://randomuser.me/api/?gender=male";

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

        RandomUserWrapper randomUserWrapper = gson.fromJson(json, RandomUserWrapper.class);
        RandomUser randomUser = randomUserWrapper.results[0];
        
        Pessoa pessoa = new Pessoa(randomUser);
        System.out.println(pessoa);
    }
}
