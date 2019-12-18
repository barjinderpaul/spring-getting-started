public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("----- No arg constructor called for the Cricket coach class ---- ");
    }

    FortuneService fortuneService;
    public CricketCoach(FortuneService fortuneService) {
        System.out.println(";;;;;;;;;;; Arged constructor called for the Cricket coach class");
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
