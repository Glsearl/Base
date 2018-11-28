package Stream_File_IO;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file= new File("C://Users//Gaols//Desktop//Demo.txt");
        FileOutputStream f= new FileOutputStream(file);
        OutputStreamWriter writer =new OutputStreamWriter(f,"UTF-8");
        writer.append("中文输入");
        writer.write("字符串");
        writer.append("\r\n");
        writer.append("输入英文");
        writer.close();
        f.close();

       FileInputStream fl=new FileInputStream(file);
        InputStreamReader reader =new InputStreamReader(fl,"UTF-8");
        StringBuffer sb=new StringBuffer();
       while (reader.ready()){
          sb.append((char)reader.read());
       }
       System.out.println(sb.toString());
       reader.close();
       fl.close();
    }

}
