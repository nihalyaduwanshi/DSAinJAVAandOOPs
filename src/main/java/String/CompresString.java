package String;

public class CompresString {
    public static void Compres(String str){
        StringBuffer output=new StringBuffer();
        int i=0;
        while (i<str.length()){
            char ch=str.charAt(i);
            int count=0;
            while (i<str.length()){
                if(ch==str.charAt(i)){
                    count++;
                    i++;
                }else
                    break;
            }
            output.append(ch);
            if(count>1){
                output.append(count);
            }

        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Compres("aaabbbbccdsa");
    }
}
