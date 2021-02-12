interface Base1 {void method();}
class BaseC
{
    public void method()
    {
        System.out.println("Instead BaseC::method");

    }
}
class Implc extends BaseC implements Base1{
    public static void main(String[] args) {
        (new Implc()).method();
    }
}
