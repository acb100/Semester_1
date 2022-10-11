public class A {
    private B myB = new B();

    public void doOne() {
        System.out.println("Hello from 1");
        myB.doTwo();
        myB.doThree();
    }
}