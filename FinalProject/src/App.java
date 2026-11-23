import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
   
    public static void main(String[] args) throws IOException {
       
        char[][] seats = loadSeats("map.txt");
        printSeats(seats);
        System.out.println("Empty seats: " + countEmpty(seats));
        
        int row = 1;
        int col = 1;
        seats[row][col] = '@';
        printSeats(seats);

        Scanner input = new Scanner(System.in);
        
        
        while (true) {

            System.out.println("move N/S/E/W to move. Q to quit.");
            String move = input.nextLine();
            int newRow = row;
            int newCol = col;
            //I made it WASD because it makes the controls easier.
            if (move.equals("w")) {
                newRow = row - 1;
            }
            else if (move.equals("s")) {
                newRow = row + 1;
            }
            else if (move.equals("d")) {
                newCol = col + 1;
            }
            else if (move.equals("a")) {
                newCol = col - 1;
            }
            else {
                System.out.println("Not a valid option");
            }
            if (newRow >= 0 && newRow < seats.length && newCol >= 0 && newCol < seats[newRow].length && seats[newRow][newCol] != '#') {
                seats[row][col] = '.';
                row = newRow;
                col = newCol;
                seats[row][col] = '@';
                printSeats(seats);
            } 
            else {
                System.out.println("You can't move there!");
            }
            
           
        }
           
       
    }

    public static char[][] loadSeats(String fileName) throws IOException {
        char[][] seats = new char[8][12];
        Scanner fileInput = new Scanner(new File(fileName));
        for (int row = 0; row < seats.length; row++) {
            String line = fileInput.nextLine();
            for (int col = 0; col < seats[row].length; col++) {
                seats[row][col] = line.charAt(col);
            }
        }
        fileInput.close();
        return seats;
       
    }

    public static void printSeats(char[][] seats) {
       
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col]);
            }
            System.out.println();
        }
    }

    public static int countEmpty(char[][] seats) {
        int empty = 0;
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col] == '.') {
                    empty++;
                }
            }
        }
        return empty;
    }
   

           
}