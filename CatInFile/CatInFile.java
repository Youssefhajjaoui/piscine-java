import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        byte[] b = System.in.readAllBytes();
        Files.write(Path.of(args[0]), b);
    }
}