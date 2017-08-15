package dvl.srg.tekwill.javafundamentals.samples.methodhiding;

/**
 * Created by smotpan on 8/11/2017.
 */
public class ClassA {

    static int X = 10;

    static void run() {
        System.out.println("ClassA run");
    }

    int y = 20;

    void showMessage() {
        System.out.println("Message from ClassA");
    }

}
