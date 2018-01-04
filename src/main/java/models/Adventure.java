package models;


import java.util.ArrayList;
import java.util.List;

public class Adventure {
//    List<String> destinations = new ArrayList<>();
    String[] destinations = {"Dubai", "Alaska", "Portland", "Europe", "South Africa", "Japan"};
    private String destination;

    public Adventure(String destination) {
        this.destination = destination;

    }
    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


}
