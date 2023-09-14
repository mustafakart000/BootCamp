package thread.CallableExercise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Callable08 {

    public static void main(String[] args) {
        int numThreads = 4;
        int numPointsPerThread = 1000000;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Callable<Integer>> piCalculationTasks = new ArrayList<>();
        for (int i = 0; i < numThreads; i++) {
            piCalculationTasks.add(new PiCalculator(numPointsPerThread));
        }
        try {
            List<Future<Integer>> results = executor.invokeAll(piCalculationTasks);
            int totalPointsInsideCircle = 0;
            for (Future<Integer> result : results) {
                totalPointsInsideCircle +=result.get();
            }
            double estimatePi = 4.0 * totalPointsInsideCircle / (numThreads * numPointsPerThread);
            System.out.println("Estimated value of Pi: "+ estimatePi);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();

    }

}
class PiCalculator implements Callable<Integer> {
    private int numPoints;

    public PiCalculator(int numPoints) {
        this.numPoints = numPoints;
    }

    @Override
    public Integer call()  {
        int pointsInsideCircle = 0;
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < numPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distance = x * x + y * y;
            if (distance <= 1) {
                pointsInsideCircle++;
            }
        }

        return pointsInsideCircle;
    }
}
