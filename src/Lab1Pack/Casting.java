package Lab1Pack;
/**
 * рассматриваются варианты выражений со смешением типов
 * например, int и long
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class Casting {
    public static void main(String[] args) {
        short age = 20;
        char sex = 'M';
        byte iq = 80;
        int height = 64;
        long distance = 300;
        float price = 99.99f;
        double money = 500.00;
        System.out.println("age =" + age);
        System.out.println("sex =" + sex);
        System.out.println("iq =" + iq);
        System.out.println("height =" + height);
        System.out.println("distance =" + distance);
        System.out.println("price =" + price);
        System.out.println("money =" + money);
        //age = sex;
        //sex = iq;
        iq = (byte) height;
        distance = height;
        //price = money;
        sex = (char) money;
        System.out.println("age =" + age);
        System.out.println("sex =" + sex);
        System.out.println("iq =" + iq);
        System.out.println("height =" + height);
        System.out.println("distance =" + distance);
        System.out.println("price =" + price);
        System.out.println("money =" + money);
    }
}
