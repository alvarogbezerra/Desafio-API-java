/*Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo usuário. */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a criptomoeda que desejas ver a cotação: ");
        var busca = scanner.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + busca + "&vs_currencies=usd";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
