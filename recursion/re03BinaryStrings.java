package recursion;

import java.util.ArrayList;
import java.util.List;

public class re03BinaryStrings {
    
    static List<String> binaryStrings(int n){
        List<String> result=new ArrayList<>();
        binaryStringshelper(n,"",result);
        return result;
    }

    static void binaryStringshelper(int n,String str,List<String> result){
        if(str.length()==n){
            result.add(str);
            return;
        }

        binaryStringshelper(n, str+"0", result);

        if(str.isEmpty()||str.charAt(str.length()-1)!='1'){
            binaryStringshelper(n, str+'1', result);
        }
    }
    public static void main(String args[]){
        int n=5;
        List<String> result=binaryStrings(n);
        for(String str :result){
            System.out.println(str);
        }
    }
}
