package Task20;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonDemo {
    public static void main(String[] args) {
        JsonSerialization js = new JsonSerialization();
        js.catFact();
        ObjectMapper objectMapper = new ObjectMapper();

    }
}
