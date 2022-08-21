public class NewThread extends Thread{
    Thread t;
    String name;
    NewThread(String threadname)
    {

        name = threadname;
        t = new Thread(this,name);
        t.start();
    }
    public void run()
    {

    }



}
