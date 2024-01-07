package String;

public class EvaluateExp {
    public static int Expres(String[] operations){
        int x=0;
        for(String operation:operations){
            switch (operation){
                case "x++": case "++x":
                    x+=1;
                    break;
                default:
                    x-=1;
            }

        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations=new String[]{"x++","x--","x++"};
        System.out.println(Expres(operations));
    }
}
