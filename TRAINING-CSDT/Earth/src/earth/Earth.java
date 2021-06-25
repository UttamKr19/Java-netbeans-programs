
package earth;

public class Earth {
    int age;
    Earth(){
        age=100000;
        System.err.println("Inside Earth");
        System.out.println("Earth age "+age);
    }
    
    public static void main(String[] args) {

            Earth e=new Earth();
            //Animal a=new Animal();
            Human h=new Human();
            System.out.println("Human dob "+h.dob);
            Aliens al=new Aliens();
            Aliens al1=new Aliens(25);
            Aliens al2=new Aliens(4,9);
            Aliens al3=new Aliens(4,5);
    }
    
public static class Human{
    int age;
    int dob=1999;
    Human()
    {
        //this.dob=2999;
        age=100;
        dob=888;
        System.err.println("Inside Human");
        System.out.println("Human age " +age);
        //System.out.println("Human this.dob "+dob);
    }
    
} 

public class Animal{
    int age;
    Animal()
    {
        System.err.println("Inside Animal");
        age=50;
        System.out.println("Animal age "+age);
    }
    
}
    
}
