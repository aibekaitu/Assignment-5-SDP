public class AccuracyTrainingStrategy implements TrainingStrategy{
    @Override
    public String createPlan(int totalMinutes){
        int warmUp = totalMinutes /6;
        int coolDown = totalMinutes / 6;
        int practiceTime = totalMinutes- warmUp-coolDown;
        int targetPractice = practiceTime*3/5;
        int distanceControl = practiceTime - targetPractice;
        return "Accuracy Training\n" + "Warm-Up: " + warmUp + "min\n"  + "Target practice: " + targetPractice + " min\n" + "Dstance control: " + distanceControl + "min\n" + "Cool-down: " + coolDown + "min\n";
    }
}
