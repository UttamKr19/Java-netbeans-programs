package jun4d;

public class Jun4d {
    int temp=4;
    
    void aa(Jun4d ob)
    {
        ob.temp=55;
    }
    
    public static void main(String[] args) {
        
        /*Jun4d obj=new Jun4d();
        obj.aa(obj);
        System.out.println(obj.temp);
        */
        int n=5;
        int z=1;
        for(int a=1;a<=n;a++)
        {
            for(int i=1;i<=a;i++)
            {
                System.out.print(i); 
            }
            
            for(int j=n-z;j>=0;j--)
            {
                
                System.out.print(" ");
            }
            
            for(int k=1;k<=n-z+1;k++)
            {
                
                System.out.print(k);
            }
            System.out.println("");
            
            
            z++;
            
        }
    }
    
}
