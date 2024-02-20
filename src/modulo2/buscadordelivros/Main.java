package buscadordelivros;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um filme para busca: ");
        //var busca = scanner.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+ "Caim_Nova_edição";  //+ busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString()); 
        
        String json = response.body();

        Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
    
        LivroGoogleBooksWrapper meuLivro = gson.fromJson(json, LivroGoogleBooksWrapper.class);
        System.out.println(meuLivro.toString());


    }
}
