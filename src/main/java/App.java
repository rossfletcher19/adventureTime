import models.Adventure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Hello and Good Day! Where would you like to travel? Dubai or Alaska");
            String desChoice = bufferedReader.readLine();
            Adventure newAdventure = new Adventure(desChoice);
            System.out.println("Have a great Adventure!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
