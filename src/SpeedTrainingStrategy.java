public class SpeedTrainingStrategy implements TrainingStrategy{
    @Override
    public String createPlan(int totalMinutes){
        int warmUp = totalMinutes/5;
        int coolDown = totalMinutes / 10;
        int intervalTime = totalMinutes - warmUp - coolDown;
        int rounds = intervalTime / 3;
        int extraMinutes = intervalTime % 3;

        return "Speed Training \n" + "Warm-up" + warmUp + "min\n" + "Intervals: " + rounds + "rounds (1 min fast footwork + 2min easy recovery)\n" +"Extra footwork: " + extraMinutes + "min\n" + "Cool-down: " + coolDown + "min\n";
    }
}
