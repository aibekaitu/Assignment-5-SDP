import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Map<String, TrainingStrategy> strategies = Map.of(
                "1", new SpeedTrainingStrategy(),
                "2", new AccuracyTrainingStrategy(),
                "3", new EnduranceTrainingStrategy()
        );
        FencingTraining training= new FencingTraining(strategies.get("1"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Fencing Training system");
            System.out.println("1. Speed training");
            System.out.println("2 Accuracy training");
            System.out.println("3. Endurance training");
            System.out.println("0. Exit");
            System.out.println("Choose a strategy: ");

            String choice = scanner.nextLine();
            if (choice.equals("0")){
                break;
            }
            TrainingStrategy selectedStrategy = strategies.get(choice);
            if (selectedStrategy == null){
                System.out.println("Invalid option. Choose 1,2,3, or 0.");
                continue;
            }
            training.setStrategy(selectedStrategy);
            System.out.println(training.createPlan(30));
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}