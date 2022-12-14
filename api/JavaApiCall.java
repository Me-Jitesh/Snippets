package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JavaApiCall {

    public static void java11ApiCall() {

        // Http Request
        try {
            var url = "https://api.github.com/users/me-jitesh";
            var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            var client = HttpClient.newBuilder().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}