import java.util.Scanner;
public class Ruin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your starting amount: ");
        double startAmount = scanner.nextDouble();
        System.out.print("Enter your win chance: ");
        double winChance = scanner.nextDouble();
        System.out.print("Enter your win limit: ");
        double winLimit = scanner.nextDouble();
        int gamesPlayedInOneDay = 0;
        System.out.print("Enter your simulation day #: ");
        int totalSimulations = scanner.nextInt();
        for(int i = 0; i <= totalSimulations; i++){
            while (startAmount<winLimit && startAmount>0){
            if (Math.random() < winChance) {
                startAmount++;
                // System.out.println(startAmount);
            }
            else{
                startAmount--; 
                // System.out.println(startAmount);
            }
            gamesPlayedInOneDay++;
            }

            if (startAmount==0){
                // System.out.println("You ran out of money");
                System.out.println("Simulation " + i + ": " + gamesPlayedInOneDay + " LOSE");
            }
            else if (startAmount==winLimit){
                System.out.println("Simulation " + i + ": " + gamesPlayedInOneDay + " WIN");
            }
            gamesPlayedInOneDay = 0;
            startAmount=10.00;
        }
    }
}
