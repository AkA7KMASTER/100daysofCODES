/*
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method 
using super keyword.If you write super.func() to call the function func(), 
it will call the method that was defined in the superclass.

Expected Output:
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.

*/

class Cycle{
    void func(){
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class Motorcycle extends Cycle{
    void func(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.func();
    }
}
public class OverridingSuper {

    public static void main(String[] args) {
        
        Motorcycle m1 = new Motorcycle();
        m1.func();
    }
}