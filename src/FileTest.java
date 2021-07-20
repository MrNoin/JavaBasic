import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        createFile("D:\\mgstudy\\JavaBasic\\file","happy.txt");
    }

    //创建文件
    public static void createFile(String uri,String fileName)
    {
        File dir = new File(uri);
        File file = new File(uri+"\\"+fileName);

        if(dir.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            dir.mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("文件名  "+file.getName());
        System.out.println("文件父目录字符串 "+file.getParent());

        System.out.println("磁盘空间大小"+file.getTotalSpace()/(1024*1024*1024)+"G");
        System.out.println("文件大小"+file.length());
    }
}
