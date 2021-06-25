
package jun22_wrapandfile;
import java.util.ArrayList;
import java.io.*;
public class Jun22_FileHandling {
    
    void meth(){
        
    }

    public static void main(String[] args) {
        
    try{
        try (FileInputStream f = new FileInputStream("E:\\aa.txt")) {
            int i;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            
            FileOutputStream fo=new FileOutputStream("E:\\aa.txt");
            
            
            String j="Hello";
            byte b[]=j.getBytes();
            fo.write(b);
            fo.close();
        }
        
    }catch(IOException e){
            System.out.println("Exception");
        }finally{
        System.out.println("\nSNAP!!!");
    }
    }
    
}
