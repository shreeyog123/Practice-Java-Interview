class newthread extends Thread
{
    Thread t;
    newthread()
    {
        Thread t1 = new Thread(this, "Thread_1");
        Thread t2 = new Thread(this, "Thread_2");
        t1.start();
        t2.start();
    }
    public void run()
    {
        Thread t2 = null;
        t2.setPriority(Thread.MAX_PRIORITY);
        Thread t1 = null;
        System.out.print(t1.equals(t2));
    }
}
class multithreaded_programing
{
    public static void main(String args[])
    {
        new newthread();
    }
}