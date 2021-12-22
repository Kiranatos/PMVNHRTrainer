package net.kiranatos;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectHelper {

    public static String getHTMLStringFromFileInResources(String path) {
        String htmlCodeFromFile = new String();
        try {
            InputStream is = ProjectHelper.class.getResourceAsStream(path);
            htmlCodeFromFile = new String(is.readAllBytes());
        } catch (IOException ex) {
            Logger.getLogger(ProjectHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return htmlCodeFromFile;
    }

    public static String getHTMLStringFromFileOutsideProject(String path) {        
        StringBuilder sb = new StringBuilder();

        try (BufferedReader readerFile = new BufferedReader(new FileReader(path))) {
            String s;
            while ((s = readerFile.readLine()) != null) {
                sb.append(s);
            }

        } catch (IOException ex) {
            Logger.getLogger(ProjectHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }
}
