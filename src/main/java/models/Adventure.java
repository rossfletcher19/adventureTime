package models;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Adventure {
//    List<String> destinations = new ArrayList<>();
//    String[] destinations = {"Dubai", "Alaska", "Portland", "Europe", "South Africa", "Japan"};
    private String destination;

    public Adventure(String destination) {
        this.destination = destination;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String actChoice;

        Map<String, String> actDubai = new HashMap();
        actDubai.put("fun", "Sight Seeing at night");
        actDubai.put("relaxation", "on the beach, midday with your toes in the water and a good book");

        Map<String, String> actAlaska = new HashMap<>();
        actAlaska.put("fun", "There is a lot of fun things to do in Alaska! Mainly in the outdoors! Today we will be trolling for salmon and deep sea Halibut fishing! Hope you like fishing!");
        actAlaska.put("relaxation", "Of course you can still relax in Alaska! Kick your shoes off by the fire and and check out a movie or play a board game!");

        Map<String, String> actEurope = new HashMap<>();
        actEurope.put("fun", "");
        actEurope.put("relaxation", "");

        Map<String, String> actSouthAfrica = new HashMap<>();
        actSouthAfrica.put("fun", "");
        actSouthAfrica.put("relaxation", "");

        Map<String, String> actJapan = new HashMap<>();
        actJapan.put("fun", "");
        actJapan.put("relaxation", "");

        try {
            if (destination.equals("Dubai")) {
                System.out.println("You have chosen to adventure to Dubai! What are you feeling like? fun or relaxation?");
                actChoice = bufferedReader.readLine();
                System.out.println(actDubai.get(actChoice));

            } else if (destination.equals("Alaska")) {
                System.out.println("You have chosen to adventure to Alaska! What are you feeling like? fun or relaxation?");
                actChoice = bufferedReader.readLine();
                System.out.println(actAlaska.get(actChoice));

            } else if (destination.equals("Portland")) {
                System.out.println("Staying home are we? That is quite alright! Home is where the heart is!!");

            } else if (destination.equals("Europe")) {
                System.out.println("You have chosen to adventure to Europe! What are you feeling like? fun or relaxation?");
                actChoice = bufferedReader.readLine();
                System.out.println(actEurope.get(actChoice));

            } else if (destination.equals("South Africa")) {
                System.out.println("You have chosen to adventure to South Africa! What are you feeling like? fun or relaxation?");
                actChoice = bufferedReader.readLine();
                System.out.println(actSouthAfrica.get(actChoice));

            } else if (destination.equals("Japan")) {
                System.out.println("You have chosen to adventure to Japan! What are you feeling like? fun or relaxation?");
                actChoice = bufferedReader.readLine();
                System.out.println(actJapan.get(actChoice));
            } else {
                System.out.println("Sorry that destination is not on the itinerary for today.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
            this.destination = destination;
    }




}
