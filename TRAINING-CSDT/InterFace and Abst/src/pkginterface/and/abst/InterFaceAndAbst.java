package pkginterface.and.abst;

public class InterFaceAndAbst extends alien implements human,animal{

    @Override
    public void size(){
        System.out.println("Size");
    }
    
//    @Override
//    public void Asize(){
//        System.out.println("Animal size");
//    }
    
    @Override
    void Xsize(){
        System.out.println("X size");
    }
    
   
    @Override
    void Xcolor(){
        System.out.println("X color");
    }
    
    
    
    public static void main(String[] args) {
        InterFaceAndAbst ob=new InterFaceAndAbst();
        
        ob.size();
        ob.size();
        ob.detail();
        ob.Xsize();
        ob.Xcolor();
        
        System.out.println("\n===============================\n");
        
        human h; 
        animal a; 
        alien x;
        
        h=new InterFaceAndAbst();
        a=new InterFaceAndAbst();
        x=new InterFaceAndAbst();
        
        h.size();
        a.size();
        x.detail();
        x.Xsize();
        x.Xcolor();
        
        
    }
    
}


interface human{
    void size();
}

interface animal{
    void size();
}

abstract class alien{
    abstract void Xsize();
    abstract void Xcolor();
    
    void detail()
    {
        System.out.println("Aliens details");
    }
}
