
package jun14;

public class Jun14 {
    
    public static void main(String[] args) {
        programmer p=new programmer();
        System.out.println("Total salary: "+ (p.salary+p.bonus));
        
    }
    
}

class emp{
    int salary=30000;
}

class programmer extends emp{
    int bonus=5000;
}