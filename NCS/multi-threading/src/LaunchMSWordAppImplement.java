class Type1 implements Runnable {
    public void run() {
        try{
            for (int i = 0; i <= 5 ;i++){
                System.out.println("Typing");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }
}

class SpellCheck1 implements Runnable {
    public void run() {
        try{
            for (int i = 0; i <= 5 ;i++){
                System.out.println("Spell Checking");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }
}

class AutoSaving1 implements Runnable {
    public void run() {
        try{
            for (int i = 0; i <= 5 ;i++){
                System.out.println("Auto Save");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }
}

public class LaunchMSWordAppImplement {
    public static void main(String[] args) {
        Type1 t1 = new Type1();
        SpellCheck1 sc1 = new SpellCheck1();
        AutoSaving1 as1 = new AutoSaving1();

        Thread tt1 = new Thread(t1);
        Thread tsc1 = new Thread(sc1);
        Thread tas1 = new Thread(as1);

        tt1.start();
        tsc1.start();
        tas1.start();
    }
}
