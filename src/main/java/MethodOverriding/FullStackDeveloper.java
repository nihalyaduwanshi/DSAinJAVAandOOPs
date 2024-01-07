package MethodOverriding;

public class FullStackDeveloper extends FrontEndDeveloper{
    public void mySkills(){
        System.out.println("I am a Full Stack Developer.");
        super.mySkills();
        System.out.println("I know backend part Node Mongo");
    }
}
