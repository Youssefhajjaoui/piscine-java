import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        File file = new File(fileName);
        Files.write(file.toPath(), content.getBytes());
    }

    public static String getContentFile(String fileName) throws IOException {
        return Files.readString(Path.of(fileName));
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}