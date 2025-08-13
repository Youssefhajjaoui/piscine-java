import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        Path p = Paths.get(args[0]);
        byte[] bytes = Files.readAllBytes(p);
        Files.write(Path.of(args[1]), bytes);
    }
}