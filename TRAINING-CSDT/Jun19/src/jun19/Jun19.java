/*


*/

package jun19;

public class Jun19 {

    
    public static void main(String[] args) {

        int a=200,b=300;
        String s="hello mello bello";
        String ss="hello mello bello";
        String t=" mello bello hello";
       
        
        System.out.println("length: "+s.length());
        System.out.println("compare: "+s.compareTo(ss));
        System.out.println("concat: "+s.concat(t));
        System.out.println("isEmpty: "+s.isEmpty());
        System.out.println("trim: "+t.trim());
        System.out.println("lower: "+s.toLowerCase());
        System.out.println("upper: "+ss.toUpperCase());
        System.out.println("Value: "+String.valueOf(a)+String.valueOf(b));
        System.out.println("replace: "+s.replace("l","oo"));
        System.out.println("contains: "+s.contains("hello"));
        System.out.println("equals: "+s.equals(t));
        System.out.println("endsWith: "+s.endsWith("lo"));
        System.out.println("startsWith: "+s.startsWith("lo"));
        System.out.println("toString: "+Integer.toString(b));
        System.out.println("charAt: "+s.charAt(4));
        
        char[] ch=t.toCharArray();        
        System.out.print("toCharArray: ");
        System.out.println(ch);
        
     
        char chh[]=new char[15];    
        s.getChars(2, 9, chh, 0);
        System.out.print("getChars: ");
        System.out.println(chh);
        
        System.out.println("index of: "+s.indexOf('l'));
        System.out.println("lastIndexOf: "+s.lastIndexOf('l'));
        System.out.println("join: "+String.join("::", s,ss,t));
        
        
        
        
        
        
        
        
    }
    
}
