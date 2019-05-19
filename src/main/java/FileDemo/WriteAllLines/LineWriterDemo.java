package FileDemo.WriteAllLines;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LineWriterDemo
{

    public static void main(String[] args)
    {
        try
        {
            final File outputFile = new File("./src/main/java/FileDemo/WriteAllLines/output.txt");

            final List<String> lines = new ArrayList<>();

            lines.add("Line 1");
            lines.add("Line 2");
            lines.add("Line 3");

            Files.write(outputFile.toPath(), lines, StandardOpenOption.CREATE);
        }
        catch (IOException ex)
        {
            Logger.getLogger(LineWriterDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
