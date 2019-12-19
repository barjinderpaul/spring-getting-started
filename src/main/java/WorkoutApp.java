import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkoutApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = (CricketCoach) context.getBean("cricketCoach");
        // or no need to cast
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(cricketCoach.getWorkout());
        System.out.println(cricketCoach.getFortune());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        System.out.println(trackCoach.getWorkout());
        System.out.println(trackCoach.getFortune());

//         setter injection;
        Coach footballCoach = context.getBean("footballCoach",Coach.class);
        System.out.println(footballCoach.getWorkout());
        System.out.println(footballCoach.getFortune());
    }
}
