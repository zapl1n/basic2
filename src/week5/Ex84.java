package week5;

public class Ex84 {

    public static void main(String[] args){
        Counter asd = new Counter(10, false);
        System.out.println("starting value: " + asd.value());
        asd.decrease(11);
        System.out.println("decrease() " + asd.value());
        asd.increase();
        System.out.println("increase() " + asd.value());

        Counter asd2 = new Counter(5);
        System.out.println("starting value: " + asd2.value());
        Counter asd3 = new Counter(true);
        System.out.println("starting value: " + asd3.value());

    }
}

// comment to commit