
package jun14a;

public class Jun14a {
    public static void main(String[] args) {
        
        SBI ob1=new SBI();
        ICICI ob2=new ICICI();
        Axis ob3=new Axis();
        
        ob1.si();
        ob2.si();
        ob3.si();
        
    }
    
}

class bank{
    int r=5;
}

class SBI extends bank{
    int p=1000;
    int t=7;
    void si()
    {
        System.out.println("SI(SBI): "+(p*r*t/100));
    }
}

class ICICI extends bank{
    int p=7000;
    int t=3;
    void si()
    {
        System.out.println("SI(ICICI): "+(p*r*t/100));
    }
}

class Axis extends bank{
    int p=3000;
    int t=2;
    void si()
    {
        System.out.println("SI(Axis): "+(p*r*t/100));
    }
}