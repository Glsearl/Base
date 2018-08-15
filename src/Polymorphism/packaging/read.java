package Polymorphism.packaging;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class read {
    public static void main(String[] args){
        BufferedReader br = null;
        try {
            br=new BufferedReader(new FileReader("fileName.txt"));
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
