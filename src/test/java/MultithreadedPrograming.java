public class MultithreadedPrograming {

    public static void main(String args[])
    {
        NewThread obj1 =      new NewThread("one");
        NewThread obj2 =     new NewThread("two");
        try
        {
            Thread.sleep(1000);
            System.out.print(obj1.t.isAlive());
        }
        catch(InterruptedException e)
        {
            System.out.print("Main thread interrupted");
        }
    }
}
