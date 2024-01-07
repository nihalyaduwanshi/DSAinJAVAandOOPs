package Polymorphism;

public class UseLanguage {   //RUN-TIME POLYMORPHISM......
    public static void main(String[] args) {
        Language lg;
        lg=new Hindi();
        lg.greetings();
        lg=new English();
        lg.greetings();
        lg=new French();
        lg.greetings();
    }
}
