package Sensor;
import IPOO.*;

public class testSensor {
    public static void main(String args[]){
        Sensor s1, s2, s3;
        s1 = new Sensor(1.5, 1.6);
        s2 = s1.clone();
        s3 = new Sensor(1.5, 1.5);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        s3.copy(s1);
        s1 = s2;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }

}
