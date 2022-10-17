import java.io.FileInputStream;
import java.io.FileOutputStream;

public class LaunchInputOutputStream {
    public static void main(String[] args) {
        try{
            String path1 = "d:\\ioprg\\input.txt";
            String path2 = "d:\\ioprg\\output.txt";

            FileInputStream fis = new FileInputStream(path1);
            FileOutputStream fos = new FileOutputStream(path2);

            int x;
            while((x = fis.read()) != -1){
                System.out.println(x);
                fos.write(x);
            }

        } catch(Exception e ){
            e.printStackTrace();
        }


    }
}
