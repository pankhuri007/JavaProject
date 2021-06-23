import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        sc.close();//to avoid the leakage of the source
        char[] c=s.toCharArray();
        Map<Character,Integer>m=new HashMap<Character,Integer>();
        for(Character ch:c){
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);//if a key is present the it will replace the old one with the new,m.get(ch) will give the current value of the key and +1 will increase the value of the key
            }
            else{
                m.put(ch,1);//if the key is not present then it will create the key and assign the value 1 to that key

            }
        }
        for(Character ch:m.keySet()){
            if(m.get(ch)>1){
                System.out.println("character "+ch+ " is repeated "+m.get(ch));
            }
        }


    }
}
