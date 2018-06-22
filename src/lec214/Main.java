package lec214;

public class Main {

    public static void main(String[] args) {
	    MyBox<Integer> box = new MyBox<>();
	    // var box = new MyBox<Integer>();  можно писать в JAVA 10  var - короткоживущия переменная. Если переменная нужна на долго var не использовать
	    box.set(5);
        System.out.println(box.getT());

        MyBox<Instrument> ins = new MyBox<>();
        ins.set(new Drum());


        MyBox<Playable> inst = new MyBox<>();
//        inst.set(new Drum());
        inst.set(new Playable() { });

        Instrument t = ins.getT();

        Pair<Integer, String> p1 = new OrderedPair<>(1, "Cat");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "Dog");
        Pair<Integer, String> p3 = new OrderedPair<>(2, "Dog");
        boolean r1 = Util.equals(p1,p2);
        System.out.println(r1);
        boolean r2 = Util.equals(p3,p2);
        System.out.println(r1);

    }

}

