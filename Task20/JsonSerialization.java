package Task20;


import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonSerialization {
    void catFact() {
       try {
           URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
           try (InputStream is = url.openStream();
                Reader reader = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(reader)){
                String line;
                while ((line = br.readLine()) != null){
                    ObjectMapper om = new ObjectMapper();
                    System.out.println(line);
                    //om.writeValue(new File("CatFact.json"),line);
                    String json = "{\"used\":false,\"source\":\"api\",\"type\":\"cat\",\"deleted\":false,\"_id\":\"591f98c5d1f17a153828aa0b\",\"__v\":0,\"text\"}";
                    CatFacts cat = om.readValue(json, CatFacts.class);
                    System.out.println(cat.getText());
                }
           } catch (IOException ex) {

           }
       } catch (MalformedURLException e) {

       }
    }
}
