public class helloWorld{    //The file name must be same as the classname which has the main method and it should always be public
    public static void main(String[] args) //it is the starting point of a program.It is always called by JRE during Runtime
    {   
        System.out.println("Hello, World!");
        printMessage();
    }
    //printMessage() is an external method if we want to execute it we have to call it explicitly in main method
    public static void printMessage() {
        System.out.println("Hello, Universe!");
    }
}