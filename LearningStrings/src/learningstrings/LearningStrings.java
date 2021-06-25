
package learningstrings;


public class LearningStrings {

    public static void main(String[] args) {
        
        char ch[]={'a','b','c','d','e','f'};
        String s=new String(ch);
        String st=new String(ch,1,4);
        System.out.println(st);
        System.out.println(s);
        System.out.println(s.subSequence(0, 4));
        System.out.println("--------------------1");
        
        String s1="sss";
        String s2="sss";
        
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println("--------------------2");
        
        String s3="abc";
        String s4=new String("abc");
        String s5=new String("abc");
        
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println("-------------------3");
        
        
        int i=23; double d=42.4; char c='a'; float f=55; 
        System.out.println(String.valueOf(i)+" "+String.valueOf(d)
                            +" "+String.valueOf(c)+" "+
                            String.valueOf(f));
        
        System.out.println(String.valueOf(ch));
        System.out.println("-------------------4");
        
        /*boolean regionMatches(int startIndex, String str2,
            int str2StartIndex, int numChars)*/
        
        String a1="asffajafuttamljfs";
        String a2="aljuttamlajfls";
        System.out.println(a1.replace('f', 'Z'));
        System.out.println(a2.replaceAll("uttam", "UTTAM"));
        System.out.println(a1.regionMatches(8, a2, 3, 5));
        
        System.out.println("------------------5");
        
        
        
        
        
        
    }
    
}
