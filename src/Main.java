//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FrogSimulation frog = new FrogSimulation(24, 5);
        System.out.println(frog.simulate());
        System.out.println(frog.runSimulations(400));
    }
}
