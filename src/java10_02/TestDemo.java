package java10_02;

/**
 * Created With IntelliJ IDEA.
 * Description:类和对象
 * User:ZouSS
 * Date:2020-10-02
 *
 * Time:18:39
 **/

class Person{
    public String name;
    public int age;

    public static int count = 10;

    public static void eat(){
        System.out.println("eat()!");
    }
    public  void sleep(){
        System.out.println("sleep()");
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.sleep();

    }

    public static void main1(String[] args) {
        Person person = new Person();//通过new 关键字实例化一个对象


    }
}
