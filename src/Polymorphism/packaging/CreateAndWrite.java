package Polymorphism.packaging;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAndWrite {
    public static void main(String[] args){
        try {
            File file =new File("fileName.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter pw=new PrintWriter(file);
            pw.println("this is test file");
            pw.print("12345664");
            pw.close();
            System.out.println("完成");
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
