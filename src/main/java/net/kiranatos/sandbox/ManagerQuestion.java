package net.kiranatos.sandbox;

import java.io.File;
import net.kiranatos.ProjectHelper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ManagerQuestion {
    public static void main(String[] args) {
        String path = "Test.html";
        String code = ProjectHelper.getHTMLStringFromFileOutsideProject(path);
        //System.out.println(code);
        
        Document docString = Jsoup.parse(code);
        Elements els = docString.select("div.title");
        
        System.out.println("\n\n" + els.toString());
        System.out.println("\n\n" + els.html());

    }
}
