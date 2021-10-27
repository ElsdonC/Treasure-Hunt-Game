import java.util.Scanner;
import java.util.Random;

public class App {

    static void showBoard() {

        // Movement increment
        int i = 1;

        // Create Player Character as 'X'
        char player[][] = new char[1][1];
        player[0][0] = 'X';

        // Create 5x5 character array
        char show[][] = new char[5][5];

        // Generate random coordinate for treasure
        Random vert = new Random();
        int v = vert.nextInt(4);
        Random hor = new Random();
        int h = hor.nextInt(4);

        //Create Treasure Character and set it to *
        char treasure[][] = new char[1][1];
        treasure[0][0] = '*';

        //Booleans for Loops
        boolean playing = true; //player is playing
        boolean found = false; //treasure has been found

        //Prints 5x5 Array with the Player in the Center
        for(int c=0; c<=4; c++){
            for(int d=0; d<=4; d++){
                if (c == 2 && d == 2) {
                    show[c][d]=player[0][0];
                    System.out.print(show[c][d]);
                    found = false;
                } else {
                    show[c][d]='O';
                    System.out.print(show[c][d]);
                    found = false;
                } 
            } 
            System.out.println("");
        }
            
        //Instructions for Player
        System.out.println("Enter wasd to move or y to quit");
        
        //Starting coordinates of player in the array
        int a = 2;
        int b = 2;

        //While the player hasn't pressed "y", this code runs
        while (playing == true) {

            //Read User Input
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
        
            //Move Player Up
            if (s.equals("w")) {
                a -= i;
                if (a <= -1) {
                    a += 1;
                    System.out.println("invalid movement, try again");
                    continue;
                } else {
                    for(int c=0; c<=4; c++){
                        for(int d=0; d<=4; d++){
                            if (c == a && d == b && c == v && d == h) {
                                show[c][d]=treasure[0][0];
                                System.out.print(show[c][d]);
                                found = true;
                            } else {
                                if (c == a && d == b) {
                                    show[c][d]=player[0][0];
                                    System.out.print(show[c][d]);
                                } else {
                                    show[c][d]='O';
                                    System.out.print(show[c][d]);
                                }
                            }   
                        } 
                        System.out.println("");
                    }
                    if (found == true) {
                        System.out.println("Treasure Found at " + v + "," + h + "!");
                    }
                }
                
            //Move Player Left
            } else if (s.equals("a")) {
                b -= i;
                if (b <= -1) {
                    b += 1;
                    System.out.println("invalid movement, try again");
                    continue;
                } else {
                    for(int c=0; c<=4; c++){
                        for(int d=0; d<=4; d++){
                            if (c == a && d == b && c == v && d == h) {
                                show[c][d]=treasure[0][0];
                                System.out.print(show[c][d]);
                                found = true;
                            } else {
                                if (c == a && d == b) {
                                    show[c][d]=player[0][0];
                                    System.out.print(show[c][d]);
                                } else {
                                    show[c][d]='O';
                                    System.out.print(show[c][d]);
                                }
                            }   
                        } 
                        System.out.println("");
                    }
                    if (found == true) {
                        System.out.println("Treasure Found at " + v + "," + h + "!");
                    }
                }

            //Move Player Right
            } else if (s.equals("d")) {
                b += i;
                if (b >= 5) {
                    b -= 1;
                    System.out.println("invalid movement, try again");
                    continue;
                } else {
                    for(int c=0; c<=4; c++){
                        for(int d=0; d<=4; d++){
                            if (c == a && d == b && c == v && d == h) {
                                show[c][d]=treasure[0][0];
                                System.out.print(show[c][d]);
                                found = true;
                            } else {
                                if (c == a && d == b) {
                                    show[c][d]=player[0][0];
                                    System.out.print(show[c][d]);
                                } else {
                                    show[c][d]='O';
                                    System.out.print(show[c][d]);
                                }
                            }   
                        } 
                        System.out.println("");
                    }
                    if (found == true) {
                        System.out.println("Treasure Found at " + v + "," + h + "!");
                    }
                }

            //Move Player Down
            } else if (s.equals("s")) {
                a += i;
                if (a >= 5) {
                    a -= 1;
                    System.out.println("invalid movement, try again");
                    continue;
                } else {
                    for(int c=0; c<=4; c++){
                        for(int d=0; d<=4; d++){
                            if (c == a && d == b && c == v && d == h) {
                                show[c][d]=treasure[0][0];
                                System.out.print(show[c][d]);
                                found = true;
                            } else {
                                if (c == a && d == b) {
                                    show[c][d]=player[0][0];
                                    System.out.print(show[c][d]);
                                } else {
                                    show[c][d]='O';
                                    System.out.print(show[c][d]);
                                }
                            }   
                        } 
                        System.out.println("");
                    }
                    if (found == true) {
                        System.out.println("Treasure Found at " + v + "," + h + "!");
                    }
                }
            } else if (s.equals("y")) {
                System.exit(0); //Terminates Program
            } else {
                System.out.println("Invalid movement, try again");
            }
            System.out.println("Enter wasd to move or y to quit");
        }       
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to treasurehunt!");
        showBoard();
    }
}
