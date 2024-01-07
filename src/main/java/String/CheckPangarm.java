package String;

public class CheckPangarm {
    public static boolean isPangram(String str){
        boolean result[]=new boolean[26];
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int index;
            if(ch>='A' && ch<='Z')
                index=ch-'A';
            else if (ch>='a' && ch<='z')
                index=ch-'a';
            else
                continue;
            result[index]=true;
        }
        for (boolean x:result){
            if(x==false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("abcdefghijklmNopQrstuvwxYz"));
    }
}
