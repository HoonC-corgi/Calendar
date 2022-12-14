import java.util.Calendar;

public class Main {
    public static void main(String []args) {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        System.out.println("현재 시간은" + hour + "시 " + minute + "분 입니다.");

        if(4 < hour && hour <= 12) {
            System.out.println("Good Morning");
        }
        else if(12 < hour && hour <= 18) {
            System.out.println("Good Afternoon");
        }
        else if(18 < hour && hour <= 22) {
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
