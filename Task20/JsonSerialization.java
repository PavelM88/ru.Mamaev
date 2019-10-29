package Task20;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

class JsonSerialization {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    void catFact() {
        try {
            URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
                CatFacts catFacts = OBJECT_MAPPER.readValue(br, CatFacts.class);
                System.out.println(catFacts.getUpdatedAt());
                System.out.println(catFacts.getText());
                String json = OBJECT_MAPPER.writeValueAsString(catFacts);
                System.out.println(json);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException ex) {
                ex.printStackTrace();
        }
    }
}
