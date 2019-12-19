public class TrackCoach implements Coach {

    FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getWorkout() {
        return "Run 5kms, do sprints for 100m, every 100s";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
