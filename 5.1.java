public class Work {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;

        double differenceM = Math.abs(10 - m);
        double differenceN = Math.abs(10 - n);

        if (differenceM < differenceN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (differenceM > differenceN) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
        }
    }
}
}
