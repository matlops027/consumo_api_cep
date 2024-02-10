import java.io.IOException;
import java.net.http.HttpResponse;

public interface ConsumoAPI {

    String get(String param) throws IOException, InterruptedException;
}
