import java.io.*;
import java.util.ArrayList;

public class LaunchReaderStream {
    public static void main(String[] args) {
        try{
            String path1 = "d:\\ioprg\\input.txt";
            String path2 = "d:\\ioprg\\output.txt";

            FileReader fr = new FileReader(path1);
            FileWriter fw = new FileWriter(path2);

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            String x;

            while((x = br.readLine()) != null){
                bw.write(x);
                System.out.println(x);
            }
            bw.flush();


        } catch(Exception e ){
            e.printStackTrace();
        }
    }
}
