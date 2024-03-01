package recursion;

public class re01AtoiRecursive {


    static int Atoi(String str){
        if(str.length()==0) return 0;

        char firstChar=str.charAt(0);


        if(!Character.isDigit(firstChar) && firstChar!='-' && firstChar!='+'){
            return 0;
        }
        boolean isNegative=(firstChar=='-');//?true:false;

        if(firstChar=='-' || firstChar=='+') str=str.substring(1);


        int result=AtoiHelper(str,0);
        if (isNegative) {
            result = -result;
        }
        return result;


    }


    static int AtoiHelper(String str, int index){
        if(index==str.length()) return 0;

        char currentChar=str.charAt(index);

        if(!Character.isDigit(currentChar)) return 0;

        int digit=currentChar-'0';

        int nextint=AtoiHelper(str, index+1);


        return digit+nextint*10 ;
    }



    public static void main(String args[]){
        String str ="-546+er";
        int result= Atoi(str);
        System.out.println(result);
    }
}
