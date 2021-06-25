package jun4f;
public class Jun4f {
    public static void main(String[] args) {

            for(int i=1;i<=1000;i++)
            {
                int a=0;
                int t=i;
                while(i>0)
                {
                    a=a+((i%10)*(i%10)*(i%10));
                    i=i/10;
                }
                i=t;
                if(a==i)
                    System.out.println(i);
            }
    }
    
}
