public class Main {
    public static void main(String[] args) {
        calculate(39000);

    }
    public static void calculate(int seconds) {

        if(seconds/3600>8) System.out.println("It is more than a working day");
        else if(seconds/3600>=5) System.out.println("Left "+ seconds/3600+ " hours");
        else if(seconds/3600<5 && seconds/3600>=2) System.out.println("Left "+ seconds/3600+ " hours");
        else if(seconds/3600<2 && seconds/3600>=1) System.out.println("One hour left");
        else if(seconds/3600<1 && seconds/3600>=0) System.out.println("It is less than 1 hour left");
        else System.out.println("The number has to be positive");


    }
}
