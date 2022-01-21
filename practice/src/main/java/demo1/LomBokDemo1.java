package demo1;

public class LomBokDemo1 {

    public static void main(String[] args) {

        Cat coco = new Cat();

        coco.setName("Coco");
        System.out.println(coco.getName());

        Cat saly = new Cat("Saly", 2.0f, 5);
        saly.toString();
    }
}
