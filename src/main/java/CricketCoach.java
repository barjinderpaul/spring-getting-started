public class CricketCoach implements Coach {

    FortuneService fortuneService;
    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "10 minutes running, 20 minutes fielding, 30 minutes batting";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }


}
