import java.util.*;


public class Demo {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();

        l.add(100);
        l.add(50);
        l.add(150);
        l.add(25);
        l.add(75);
        l.add(125);
        l.add(175);

        System.out.println(l);

        Comparator<Integer> c = (i1, i2) -> (i1>i2)?1:(i1<i2)?-1:0;
        Collections.sort(l, c);
        System.out.println(l);
    }
}

