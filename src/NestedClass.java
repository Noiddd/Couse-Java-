class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("HI FROM OUTER CLASS");

        // Local inner class can only be used in this method
        class LocalInnerClass {
            String localInnerClassVariable = "Here's Johnny";

            public void printLocalInnerClassVariable() {
                System.out.println(localInnerClassVariable);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassVariable();
    }

    class InnerClass {
        int innerNumber = 0;

        public void whatsUp() {
            System.out.println("Whats up from the inner class");
        }
    }
}


public class NestedClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyThere(); // prints: "HI FROM OUTER CLASS" && "Here's Johnny"

        OuterClass.InnerClass innerClass = outer.new InnerClass();
        innerClass.whatsUp(); // prints: "Whats up from the inner class"
    }
}
