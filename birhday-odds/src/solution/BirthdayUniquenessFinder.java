package solution;

public class BirthdayUniquenessFinder {
    public static void main (String[] args){
        birthdays3();
        birthdaysFrom365();
        birthdayEveryday();
    }


    //problem 7a
    public static void birthdays3(){
        int [] days = new int [365];
        int counter = 0;
        while(true){
            int day = (int)(Math.random()*365+1);
            days[day-1]++;
            counter++;
            if(days[day]>=3){
                break;
            }
        }
        System.out.print("The number of people who needed to be selected before we found 3 with the same birthday was ");
        System.out.println(counter);
    }

    //problem 7b
    public static void birthdaysFrom365(){
        int [] days = new int [365];
        int birthdayCounter = 0;
        int counter = 0;
        while(counter <365){
            int day = (int)(Math.random()*365+1);
            days[day-1]++;
            if(days[day-1]==1) {
                birthdayCounter++;
            }
            counter++;
        }
        System.out.println("The number of unique birthdays was "+birthdayCounter);
    }

    //problem 7c
    public static void birthdayEveryday(){
        int [] days = new int [365];
        int individCounter = 0;
        int UniqueBirthdayCounter = 0;
        while(UniqueBirthdayCounter <365){
            int day = (int)(Math.random()*365+1);
            days[day-1]++;
            individCounter++;
            if(days[day-1]==1) {
                UniqueBirthdayCounter++;
            }
        }
        System.out.println("The number of individuals selected in order to have one or more birthdays every day was "
                +individCounter);
    }
}
