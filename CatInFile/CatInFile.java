import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        InputStream input = System.in;
        byte[] b = input.readAllBytes();
        Files.write(Path.of(args[0]), b);
    }
}