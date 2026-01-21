package clases;



import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteHttp {
    private HttpClient httpClient = HttpClient.newHttpClient() ;
    private String apiKey = "172323dd37f35ae3cec3fbe1";
    private String url_base = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/";
    public MonedaExchange buscarMoneda(String monedaOriginal)
    {
        MonedaExchange resultadoMoneda = null;
        String url = url_base + monedaOriginal;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            resultadoMoneda =  httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(json -> {
                        Gson gson = new Gson();
                        return gson.fromJson(json,MonedaExchange.class);
                    })
                    .join();
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return resultadoMoneda;

    };
}
