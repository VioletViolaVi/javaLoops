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

        // for loops
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        String[] heroes = {"raven", "beastboy", "robin", "cyborg", "starfire", "storm", "hercules", "arrow", "killer frost", "catwomen"};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(i+1 + ". " + heroes[i]);
        }
    }
}
