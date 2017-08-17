package dvl.srg.tekwill.javafundamentals.samples.methodhiding;

/**
 * Created by smotpan on 8/17/2017.
 */
public class TrenaryOperatorSample {

    public static void main(String[] args) {

        int x = 100;

        Object flag = x > 10 ? "true" : false;

        System.out.println(flag);

        String sFlag = (String) flag;
        boolean bFlag = (boolean) flag;


    }
}
