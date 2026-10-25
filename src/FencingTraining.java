import java.util.Objects;
public class FencingTraining {
    private TrainingStrategy strategy;
    public FencingTraining(TrainingStrategy strategy){
        setStrategy(strategy);
    }
    public void setStrategy(TrainingStrategy strategy){
        this.strategy=Objects.requireNonNull(strategy,"Strategy must not be null");
    }
    public String createPlan(int totalMinutes){
        if (totalMinutes<15){
            throw new IllegalStateException("Training must last at least 15 minutes");
        }
        return strategy.createPlan(totalMinutes);
    }
}
