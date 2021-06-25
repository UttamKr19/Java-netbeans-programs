package pkg8piecespuzzle;

class box{
    int data;
    box up;
    box down;
    box left;
    box right;
    
    box(int x){
        data=x;
        up=down=left=right=null;
    }
}


public class Main {

    
    public static void main(String[] args) {
     
        Main ob=new Main();
        
        box b1=new box(0);
        box b2=new box(4); 
        box b3=new box(3); 
        
        box b4=new box(5); 
        box b5=new box(1); 
        box b6=new box(2);
        
        box b7=new box(8);
        box b8=new box(6);
        box b9=new box(7);
        
        b1.right=b2; b1.down=b4;
        b2.left=b1; b2.right=b3; b1.down=b5;
        b3.left=b2; b3.down=b6;
        b4.right=b5; b4.up=b1; b4.down=b7;
        b5.up=b2; b5.down=b8; b5.left=b4; b5.right=b6;
        b6.left=b5; b6.up=b3; b6.down=b9;
        b7.up=b4; b7.right=b8;
        b8.left=b7; b8.right=b9; b8.up=b5;
        b9.left=b8; b9.up=b6;
        
        
        
        
    }
    
}
