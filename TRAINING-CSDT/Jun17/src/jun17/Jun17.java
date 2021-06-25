/*
==> static, this, final, super keyword
=>static
*/

package jun17;
public class Jun17 {

    int roll;
    String name;
    static String college="abc";
    
    void disp(int roll,String name){
        System.out.println("Roll: "+roll+ "\nName: "+name+"\nCollege: "+college);
    }
    
    public static void main(String[] args) {
        
        Jun17 ob=new Jun17();
        Jun17 ob1=new Jun17();
        ob.disp(1,"Uttam");
        System.out.println("");
        ob1.disp(2,"kumar");
        
        
    }
    
}
