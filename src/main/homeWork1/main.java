package main.homeWork1;

public class main {
    public static void main(String[] args) {
            int radius = 10;
            double pi = 3.14;
            double perimeter = 2 * pi * radius;
            System.out.println(perimeter);

            int radius1 = 10;
            double pi1 = 3.14;
            System.out.println("Периметр окружности:" + (2 * pi1 * radius1));

            int a = 1;
            int b = 10;
            int summa = (b * (a+b)/2);
            System.out.println(summa);

        double a1 = 10.5;
        int b1 = 45;
        int summa1 = (int) ((a1 * 0.95) + (b1 * 0.85));
        System.out.println(summa1);

        double a2 = 10.5;
        int b2 = 45;
        int summa2 = (int) ((a2 * 2) + (b2 * 4));
        System.out.println(summa2);

        double a3 = 10.5;
        int b3 = 45;
        int summa3 = (int) ((a3 * 0.95) + (a3 * 0.85) + (b3 * 4));
        System.out.println(summa);

        int act = 127;
        int c = act / 10;
        int act1 = c / 10;
        int act2 = c % 10;
        int act3 = act % 10;
        System.out.println("act1:" + act1);
        System.out.println("act2:" + act2);
        System.out.println("act3:" + act3);

        int best = ((act3 * 100) + (act2 * 100) + act1);
        System.out.println("best:" + best);

        boolean result = act == best;
        System.out.println("act == best:" + result);

        result = act != best;
        System.out.println("act != best:" + result);

        result = act < best;
        System.out.println("act < best:" + result);

        result = act <= best;
        System.out.println("act <= best:" + result);

        result = act > best;
        System.out.println("act > best:" + result);

        result = act >= best;
        System.out.println("act >= best:" + result);

        int p = 1389;
        int k = p / 10;
        int n = k / 10;
        int p1 = n / 10;
        int p2 = n % 10;
        int p3 = k % 10;
        int p4 = p % 10;
        int summa_p = p1 + p2 + p3 + p4;

        if (summa_p <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int aro = 1389;
        int bar = aro / 10;
        int car = bar / 10;
        int aro1 = car / 10;
        int aro2 = car % 10;
        int aro3 = bar % 10;
        int aro4 = aro % 10;
        int summa_aro = aro1 + aro2 + aro3 + aro4;

        Switch(summa_aro <=20){
            case true:
                System.out.println("true");
                break;
            case false:
                System.out.println("false");
                break;

        }
}

    private static void Switch(boolean boom) {
    }
