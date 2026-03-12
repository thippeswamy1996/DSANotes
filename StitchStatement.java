import java.util.Scanner;

public class StitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = 0;
        int Y = 0;

        System.out.print("Enter move (L/R/U/D): ");
        char move = sc.next().charAt(0);

        switch (move) {
            case 'L':
                X--;
                break;
            case 'R':
                X++;
                break;
            case 'U':
                Y++;
                break;
            case 'D':
                Y--;
                break;
            default:
                System.out.println("Invalid");
                return;
        }

        System.out.println("Final Coordinates: (" + X + ", " + Y + ")");
        sc.close();
    }
}
