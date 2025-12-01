package CustomSetV2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileLoader {

    public static List<String> loadResourceFile(String filename) throws IOException {
        InputStream is = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream(filename);

        if (is == null) throw new FileNotFoundException("Resource not found: " + filename);
        return new String(is.readAllBytes(), StandardCharsets.UTF_8)
                .lines()
                .toList();
    }
}
