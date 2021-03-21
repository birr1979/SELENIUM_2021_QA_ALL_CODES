package SeleniumClass5;

public class child extends parent {
    static void startingEngine() {
        System.out.println("Starting childs Engine");
    }

    public static void main(String[] args) {

        child p = new child();
        p.startingEngine();


        int[] x = {5, 6, 9, 0};
        int max = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];

                System.out.println("max: " + max);
                break;

            }
        }


    }

}
