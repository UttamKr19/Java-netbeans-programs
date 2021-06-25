package jun11a;

public class Jun11a {

    int x=100;
            
    void show(int x)
    {
        System.out.println("x in show: "+x);
        x=x+60;
        System.out.println("x in show again: "+x);
    }
    
    void show1(Jun11a obj)
    {
        //obj=new Jun11a(); 
        
        System.out.println("in show: "+ obj.x);
        obj.x++;
        System.out.println("in show again: "+ obj.x);
    }
    
    public static void main(String[] args) {
        
        Jun11a ob=new Jun11a();
        System.out.println("in main: "+ ob.x);
        ob.show1(ob);
        System.out.println("in main again: "+ ob.x);
        
        
    }
    
}
