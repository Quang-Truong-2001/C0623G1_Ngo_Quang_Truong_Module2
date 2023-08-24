package ss19_string_regex.thuc_hanh.th3;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.InflaterInputStream;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner=new Scanner(new InflaterInputStream(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content=scanner.next();
            scanner.close();
            content=content.replaceAll("\\n+","");
            Pattern p=Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher= p.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        }  catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
