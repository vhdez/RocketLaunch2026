//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Construct a rocket
        Rocket myRocket = new Rocket("Triton", 5);
        Rocket myRocket2 = new Rocket("Soyuz", 10);

        // Tell the rocket to launch
        boolean success = myRocket.launch();
        // Cheer when the rocket has launched
        if (success) {
            System.out.println(myRocket.rocketName + " has launched.  Hooray!");
        } else {
            System.out.println(myRocket.rocketName + " did NOT launch.  Boo!");
        }

        boolean success2 = myRocket2.launch();

        if (success2) {
            System.out.println(myRocket2.rocketName + " has launched.  Hooray!");
        } else {
            System.out.println(myRocket2.rocketName + " did NOT launch.  Boo!");
        }

    }
}