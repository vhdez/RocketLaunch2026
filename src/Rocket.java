public class Rocket implements Rocketish {
    // Fields
    String rocketName;
    int countdownTime;

    public Rocket(String rocketName, int countdownTime) {
        this.rocketName = rocketName;
        this.countdownTime = countdownTime;
    }

    // Method
    public boolean launch() {
        for (int i = countdownTime; i > 0; i = i  - 1) {
            System.out.println(rocketName + " will launch in " + i + " seconds.");
            try {
                Thread.sleep(1000); // Wait 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();   // restore flag
                System.out.println("Sleep was interrupted");
            }
        }
        return true;
    }
}
