import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final SharedResource sharedResource;

    public RandomNumberGenerator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            int randomNumber = rand.nextInt(100);
            sharedResource.setNumber(randomNumber);
            System.out.println("Generated number: " + randomNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private final SharedResource sharedResource;

    public SquareCalculator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedResource.getNumber();
            if (number % 2 == 0) {
                int square = number * number;
                System.out.println("Square of " + number + " is: " + square);
            }
        }
    }
}

class CubeCalculator extends Thread {
    private final SharedResource sharedResource;

    public CubeCalculator(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            int number = sharedResource.getNumber();
            if (number % 2 != 0) {
                int cube = number * number * number;
                System.out.println("Cube of " + number + " is: " + cube);
            }
        }
    }
}

class SharedResource {
    private int number;
    private boolean newNumberGenerated = false;

    synchronized void setNumber(int number) {
        this.number = number;
        newNumberGenerated = true;
        notifyAll();
    }

    synchronized int getNumber() {
        while (!newNumberGenerated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        newNumberGenerated = false;
        return number;
    }
}

public class MultiThreadApplication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(sharedResource);
        SquareCalculator squareCalculator = new SquareCalculator(sharedResource);
        CubeCalculator cubeCalculator = new CubeCalculator(sharedResource);

        randomNumberGenerator.start();
        squareCalculator.start();
        cubeCalculator.start();
    }
}
