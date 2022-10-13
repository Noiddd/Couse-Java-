class MSWordApp extends Thread {
    public void run() {
        if(getName().equals("type")){
            type();
        } else if(getName().equals("spellcheck")){
            spellCheck();
        } else if (getName().equals("autosaving")) {
            autoSaving();
        }
    }

    public void type() {
        try{
            for (int i = 0; i <= 5 ;i++){
                System.out.println("Typing111");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }

    public void spellCheck() {
        try{
            for (;;){
                System.out.println("Spell Checking");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }

    public void autoSaving() {
        try{
            for (;;){
                System.out.println("Auto Save");
                Thread.sleep(3000);
            }
        } catch(Exception e){
            System.out.println("Problem!!");
        }
    }
}

public class LaunchMSWordAppSingle {
    public static void main(String[] args) {
        MSWordApp ms1 = new MSWordApp();
        MSWordApp ms2 = new MSWordApp();
        MSWordApp ms3 = new MSWordApp();

        ms1.setName("type");
        ms2.setName("spellcheck");
        ms3.setName("autosaving");

        ms2.setDaemon(true);
        ms3.setDaemon(true);

        ms2.setPriority(8); // anything above 5 will work
        ms2.setPriority(7);

        ms1.start();
        ms2.start();
        ms3.start();
    }
}
