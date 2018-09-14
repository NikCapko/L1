package t3;

public class Task3 {

    public void getResult() {

        System.out.println("\n Task 3");
        
        int time[] = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        String player[] = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        
        System.out.println(player[Maraphon.getChempion(time)]);

        /*Player playerArray[] = {
            new Player("Elena", 341),
            new Player("Thomas", 273),
            new Player("Hamilton", 278),
            new Player("Suzie", 329),
            new Player("Phil", 445),
            new Player("Matt", 402),
            new Player("Alex", 388),
            new Player("Emma", 275),
            new Player("John", 243),
            new Player("James", 334),
            new Player("Jane", 412),
            new Player("Emily", 393),
            new Player("Daniel", 299),
            new Player("Neda", 343),
            new Player("Aaron", 317),
            new Player("Kate", 265)
        };

        System.out.println(playerArray[Maraphon.getChempion(playerArray)].getName());
         */
    }

}
