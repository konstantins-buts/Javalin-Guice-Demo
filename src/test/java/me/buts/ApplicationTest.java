package me.buts;

import me.buts.meta.IntegrationTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@IntegrationTest
class ApplicationTest {

    @Test
    void happy_path() throws Exception {
        HttpResponse<String> response = getMessages(HttpClient.newHttpClient());

        assertThat(response.statusCode()).isEqualTo(200);
        assertThat(response.body()).isEqualTo("{\"text\":\"Hello World!\"}");
    }

    private HttpResponse<String> getMessages(HttpClient client) throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder(URI.create("http://localhost:8080/api/messages")).build();
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }
}
