
package abs1;

/**
 *
 * @author Uttam
 */

abstract class GeneralBank{
    double SavingsIR;
    double FixedDepositIR;

    abstract public double getSavingsIR();

    abstract public double getFixedDepositIR();
    
}

class ICICIBank extends GeneralBank{
    public double getSavingsIR(){
        return 4;
    }
    public double getFixedDepositIR(){
        return 8.5;
    }
}
        
class KotMBank extends GeneralBank{
    public double getSavingsIR(){
        return 6;
    }
    public double getFixedDepositIR(){
        return 9;
    }
}
        
public class Abs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICICIBank i=new ICICIBank();
        KotMBank k=new KotMBank();
        GeneralBank g=new ICICIBank();
        GeneralBank h=new KotMBank();
        
        System.out.println(i.getFixedDepositIR());
        System.out.println(i.getSavingsIR());
        System.out.println(k.getFixedDepositIR());
        System.out.println(k.getSavingsIR());
        System.out.println(g.getFixedDepositIR());
        System.out.println(g.getSavingsIR());
        System.out.println(h.getFixedDepositIR());
        System.out.println(h.getSavingsIR());
    }
    
}
