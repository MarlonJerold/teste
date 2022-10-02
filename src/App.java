import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        //Fazer conexao https e buscar os top 250 filmes
        String url = "https://imdb-api.com/en/API/Top250Movies/k_l89y0mfu";
        URI endereco = URI.create(url);
        HttpClient newHttpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = newHttpClient.send(request, BodyHandlers.ofString());
        String body = response.body();

        //Extrair os dados que intereçam (título, poster, classificação)
        JsonParse parser = new JsonParse();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        
        //Exibir e manipular os dados
        for (Map<String,String> film : listaDeFilmes) {
            System.out.println(film.get("title"));
            System.out.println(film.get("image"));
            System.out.println(film.get("imDbRating"));
            System.out.println();
        }
        //testee
}
