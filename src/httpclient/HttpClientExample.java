package httpclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HttpClientExample {

    public static void main(String args[]) {
        List<String> godsList = new ArrayList<String>();
        try {
            URL url = new URL("https://my-json-server.typicode.com/jabrena/latency-problems/greek");
            String content =httpClient(url);
            Pattern p = Pattern.compile("\"([^\"]*)\"");
            Matcher m = p.matcher(content);
            while (m.find()) {
                godsList.add(m.group(1));
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }

        Map<String, Integer> godsContentMap = godsList.stream().collect(Collectors.toMap(god-> god, god ->{
                try {
                    URL url = new URL("https://en.wikipedia.org/wiki/" + god);
                    return httpClient(url).length();
                }catch(IOException ioe){
                    ioe.printStackTrace();
                }
                return null;
        }));

        long max = godsContentMap.values().stream().max(Comparator.naturalOrder()).get();
        List<String> maxGodsList = godsContentMap.entrySet().stream()
                .filter(gods -> gods.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(maxGodsList);


    }

    public static String httpClient(URL url){
        try{
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            return content.toString();

        }catch(IOException ioe){
            System.out.println(ioe);
            return null;
        }
    }
}
