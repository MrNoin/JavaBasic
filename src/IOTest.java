import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        int numberRead = 0;
        byte[] buffer=new byte[512];//缓存区
        FileInputStream inputStream= null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("D:\\mgstudy\\JavaBasic\\file\\happy.txt");
            outputStream = new FileOutputStream("D:\\mgstudy\\JavaBasic\\file\\good.txt",true);
            while ((numberRead=inputStream.read(buffer))!=-1)
            {
                outputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        try {
            inputStream.close();
            outputStream.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}