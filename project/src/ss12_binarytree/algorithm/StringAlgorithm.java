package ss12_binarytree.algorithm;

public class StringAlgorithm {
    public static void main(String[] args) {
        String result=StringAlgorithm.solution("CodeGym");
        System.out.println(result);
    }
    public static String solution(String inputString){
        if(inputString.length()==0){
            return inputString;
        }
        String result ="";
        String[] str=inputString.split("");
        for(int i=0;i< str.length;i++){
            if(str[i].charAt(0)<97&&i>0){
                result+=" ";
            }
            result+=str[i].toLowerCase();
        }
        return result;
    }
}
