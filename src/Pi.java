public class Pi {

    public static void main(String[] args) {
        int totalDarts = 1000000; // Number of darts to throw
        int insideCircle = 0;

        for (int i = 0; i < totalDarts; i++) {
            double x = Math.random(); // x-coordinate
            double y = Math.random(); // y-coordinate

            if (x*x + y*y <= 1) { // check if inside quarter circle
                insideCircle++;
            }
        }

        double piEstimate = 4.0 * insideCircle / totalDarts;
        System.out.println("Estimated Pi: " + piEstimate);
    }
}


