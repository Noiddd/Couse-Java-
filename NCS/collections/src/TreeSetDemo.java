import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;

        if(i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        MyComparator mc1 = new MyComparator();

        TreeSet<Integer> ts = new TreeSet<Integer>(mc1);
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);


    }
}
