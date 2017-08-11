package dvl.srg.tekwill.javafundamentals.samples.methodhiding;

/**
 * Created by smotpan on 8/11/2017.
 */
public class ClassB extends ClassA {

    static int X = 20;

    static void run() {
        System.out.println("ClassB run");
    }

    int y = 40;

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA ab = new ClassB();
        ClassB b = new ClassB();

        System.out.println("--------------------------------");
        System.out.println("a.X = " + a.X);
        System.out.println("a.X = " + ab.X);
        System.out.println("a.X = " + b.X);
        System.out.println("--------------------------------");
        System.out.println("a.X = " + a.y);
        System.out.println("a.X = " + ab.y);
        System.out.println("a.X = " + b.y);
        System.out.println("--------------------------------");
        a.run();
        ab.run();
        b.run();
    }
}
