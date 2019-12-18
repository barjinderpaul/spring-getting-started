public class FootballCoach implements Coach {

    public FootballCoach (){
        System.out.println("---------- No arg constructor called for the FootballCoach ---------");
    }
    FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("'''''''''' Setter method called for the FootballCoach class '''''''''''");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkout() {
        return "Go to the field and practice penalty shootouts";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
