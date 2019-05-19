package FileDemo.ReadAllLines;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderDemo
{

    public static void main(String[] args)
    {
        try
        {
            final File pathToFile = new File("./src/main/java/FileDemo/TestFile.txt");

            final List<String> fileLines = Files.readAllLines(pathToFile.toPath());

            for (String line : fileLines)
            {
                System.out.println(line);
            }
        }
        catch (IOException ex)
        {
            Logger.getLogger(FileReaderDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
