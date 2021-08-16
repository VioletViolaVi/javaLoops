import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        // while loop
        int counter = 1;
        System.out.println("This is a While Loop");
        while (counter < 11) {
            if (counter % 2 == 0) {
                System.out.println(counter + " is an Even Number!");
            } else {
                System.out.println(counter + " is an Odd Number!");
            }
            counter++;
        }

        System.out.println("\n");

        // do while loop
        int count = 1;
        do {
            System.out.println("This do while loop will only run once!");
            count++;
        } while (count == 0);

        System.out.println("\n");

        // for i loop
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        String[] heroes = {"raven", "beastboy", "robin", "cyborg", "starfire", "storm", "hercules", "arrow", "killer frost", "catwomen"};

        // for i loop
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(i+1 + ". " + heroes[i]);
        }

        System.out.println("\n");

        // for each loop
        int num = 0;
        for (String hero : heroes) {
            num++;
            System.out.println(num + ". " + hero);
        }

        System.out.println("\n");

        // for each loop
        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("brown");
        colours.add("blue");
        colours.add("purple");
        colours.add("yellow");
        colours.add("pink");
        colours.add("white");
        colours.add("orange");
        colours.add("black");
        colours.add("gold");
        for (String colour : colours) {
            System.out.println(colour);
        }

        System.out.println("\n");

        // for each loop
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(56);
        ages.add(26);
        ages.add(34);
        ages.add(99);
        ages.add(41);
        ages.add(87);
        for (int age : ages) {
            System.out.println(age);
        }

    }
}
