package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    
    public static <T> String toJson(T object) {
        return object instanceof String 
                ? (String) object
                : gson.toJson(object);
    }
}
