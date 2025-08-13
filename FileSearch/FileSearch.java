
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class FileSearch {
    public static String searchFile(String fileName) {
        Path document = Path.of("documents");
        try {
            Optional<Path> found = Files.walk(document)
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().equals(fileName))
                    .findFirst();

            return found.map(Path::toString)
                    .orElse(null);
        } catch (IOException e) {
            return e.toString();
        }
    }
}
