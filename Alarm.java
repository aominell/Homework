package home_work4;

public class Main {

    public static void main(String[] args) {

            boolean weekday = false;
            boolean vacation = false;
            if (sleepIn(weekday, vacation))
            {
                System.out.println("Можем спать дальше");
            }
            else
            {
                System.out.println("Пора идти на работу");
            }
    }

    private static boolean sleepIn(boolean weekday, boolean vacation)
    {
        return vacation || !weekday;
    }
}
