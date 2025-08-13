import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
    public static void cat(String[] args) throws IOException {
        for (String path : args) {
            Path p = Paths.get(path);
            byte[] bytes = Files.readAllBytes(p);
            OutputStream stdout = System.out;
            stdout.write(bytes);
            stdout.flush();
        }
    }
}