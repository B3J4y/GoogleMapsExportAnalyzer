import com.fasterxml.jackson.databind.ObjectMapper;
import entity.LocationHistory;

import java.io.IOException;
import java.io.InputStream;

public class JSONConverter {
    public static LocationHistory toLocationHistory(String filename) {
        InputStream resStream = JSONConverter.class.getResourceAsStream(filename);
        LocationHistory myMap = new LocationHistory();

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            myMap = objectMapper.readValue(resStream, LocationHistory.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myMap;
    }
    public static void main(String[] args) {
        LocationHistory locationHistory = JSONConverter.toLocationHistory("Standortverlauf.json");
        System.out.println("There are " + locationHistory.getActivities().size() + " activities in your history.");

    }
}
