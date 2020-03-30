import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Thanos {

    public static void main(String[] args) {

        //Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();
        
        //Those heroes to the list

        Hero blackWidow = new Hero ("Black Widow", 34); 
        Hero captainAmerica = new Hero ("Captain America", 100); 
        Hero vision = new Hero ("Vision", 3);  
        Hero ironMan = new Hero ("Iron Man", 48);  
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);  
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctorStrange = new Hero ("Docteur Strange", 42);


        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);
        


        // It's Thor birthday, now he's 1501
        thor.setAge(1501);
        

        // Shuffle the heroes list
        Collections.shuffle(heroes);
        System.out.println(heroes);
        


        // Keep only the half of the list
        List <Hero> heroes2 = heroes.subList(0, 4);
        System.out.println(heroes2);


        // Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < heroes2.size(); i++) {
            Hero stuff = heroes2.get(i);
            System.out.println(stuff.getName());
        }

    }
}
