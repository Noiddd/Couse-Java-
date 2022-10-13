class Type extends Thread {
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

class SpellCheck extends Thread {
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

class AutoSaving extends Thread {
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


public class LaunchMSWordAppThread {
    public static void main(String[] args) {
        Type t = new Type();
        SpellCheck sc = new SpellCheck();
        AutoSaving as = new AutoSaving();

        t.start();
        sc.start();
        as.start();
    }
}
