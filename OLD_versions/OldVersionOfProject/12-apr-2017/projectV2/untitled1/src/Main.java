import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());


        Date todayDate  = new Date();
        todayDate.setDate(7);
        todayDate.setMonth(3);

        Date afterDate  = new Date();
        afterDate.setDate(7);
        afterDate.setMonth(2);


        if(afterDate.after(todayDate) ) {
            // In between
            System.out.println("Lolo;");

        }
        else{
            System.out.println("Meme;");

        }
    }
}
