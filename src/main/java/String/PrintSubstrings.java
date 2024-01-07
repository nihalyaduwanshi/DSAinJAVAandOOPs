package String;

public class PrintSubstrings {
    public static void showSubstrings(String str){
        int length=str.length();
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
    public static void showSubstring2(String str){
        int length=str.length();
        for (int i=0;i<length;i++){
            StringBuffer sb=new StringBuffer();
            for (int j=i;j<length;j++){
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }
    }

    public static void main(String[] args) {
        //showSubstrings("abc");
        showSubstring2("abc");
    }
}
