import javax.swing.*;

public class SimpleGraph extends JPanel {
    public static void main(String[] args){

        private static void createAndShowGui(){
            List<Double> scores = new ArrayList();
            Random random = new Random();

            int maxDataPoints = 20;
            int maxScore = 8;

            for(int i = 0; i < maxDataPoints; i++){

                scores.add((double)random.nextDouble() * maxScore)
            }
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui()
            }
        });
    }
}
