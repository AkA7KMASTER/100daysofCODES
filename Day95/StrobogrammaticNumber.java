import java.util.*;
public class StrobogrammaticNumber {
    static char rotate(char a){
        if(a=='6')
            return '9';
        else if(a=='9')
            return '6';
        else 
            return a;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        int l=s.length();
        String s2="";
        if(s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("7")){
            System.out.println(s+" is not a strobogrammatic no");
        }else if(l==1){
            if(s.contains("0")||s.contains("1")||s.contains("8")){
                System.out.println(s+" is a strobogrammatic no");
            }else{
                System.out.println(s+" is not a strobogrammatic no");
            }
        }
        else{
            String s1=new StringBuilder(s).reverse().toString();
            for(int i=0;i<s1.length();i++){
                s2=s2+rotate(s1.charAt(i));
            }
            if(s.equals(s2)){
                System.out.println(s+" is a strobogrammatic no");
            }else{
                System.out.println(s+" is not a strobogrammatic no");
            }
        }
        sc.close();
    }
}
