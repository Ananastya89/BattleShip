package battleship;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BattleShip newBattle = new BattleShip();
        newBattle.printInfo();
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        String[] coordinates = sc.nextLine().split(" ");
        while (!checkingCoordinates(coordinates, 5, "Aircraft Carrier")) {
            coordinates = sc.nextLine().split(" ");
        }
        newBattle.placingShip(coordinates);
        newBattle.printInfo();

        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        coordinates = sc.nextLine().split(" ");
        while (!checkingCoordinates(coordinates, 4, "Battleship")) {
            coordinates = sc.nextLine().split(" ");
        }
        newBattle.placingShip(coordinates);
        newBattle.printInfo();

        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        coordinates = sc.nextLine().split(" ");
        while (!checkingCoordinates(coordinates, 3, "Submarine")) {
            coordinates = sc.nextLine().split(" ");
        }
        newBattle.placingShip(coordinates);
        newBattle.printInfo();

        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        coordinates = sc.nextLine().split(" ");
        while (!checkingCoordinates(coordinates, 2, "Destroyer")) {
            coordinates = sc.nextLine().split(" ");
        }
        newBattle.placingShip(coordinates);
        newBattle.printInfo();
    }


    public static boolean checkingCoordinates(String[] coordinates, int a, String ship) {
        boolean coordinatesAreOk = true;
        if (coordinates[1].charAt(1) - coordinates[0].charAt(1) + 1 != a && coordinates[1].charAt(0) - coordinates[0].charAt(0) + 1 != a) {
            System.out.printf("Error! Wrong length of the %s! Try again:%n", ship);
            coordinatesAreOk = false;
        } else if (coordinates[1].charAt(1) != coordinates[0].charAt(1) && coordinates[1].charAt(0) != coordinates[0].charAt(0)) {
            System.out.println("Error! Wrong ship location! Try again:");
            coordinatesAreOk = false;
        }
        return coordinatesAreOk;
    }
}
