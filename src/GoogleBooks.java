/*Este projeto foi o desafio final proposto no curso: "Java: consumindo API, gravando arquivos e lidando com erros" da Alura, e consiste em uma aplicação que usa 3 API diferentes. */

/*Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API. */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = scanner.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString()); 
        
        System.out.println(response.body());
    }
}
