public class loopThread extends Thread {
    UserDataProcessor udp1;

    public loopThread(UserDataProcessor udp) {
        udp1 = udp;
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("loop working");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        udp1.getdatafromRemote();

    }


}
