public class EnduranceTrainingStrategy implements TrainingStrategy{
    @Override
    public String createPlan(int totalMinutes){
        int warmUp = totalMinutes/5;
        int coolDown=totalMinutes/5;
        int trainingTime=totalMinutes-warmUp-coolDown;
        int steadyFootwork=trainingTime*2/3;
        int lightFootwork = trainingTime-steadyFootwork;
        return "Endurance Training\n" + "Warm-up: " + warmUp + "min\n" + "Light footwork: " + lightFootwork + "min\n" + "Steady footwork" + steadyFootwork + "min\n" + "Cool-dowb: " + coolDown + "min\n";
    }
}
