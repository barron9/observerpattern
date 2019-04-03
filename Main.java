import java.util.Observable;
import java.util.Observer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting!");

        //custom observer
        RepositoryObserver ro =new RepositoryObserver() {
            @Override
            public void onUserDaraChanged(String fullname, int age) {
                System.out.println(fullname);

            }
        };

        //javas observer
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {

            }
        };

        //greenrobot eventbus
        new bus().post(new Object());


        UserDataProcessor udp = UserDataProcessor.getInstance();
        System.out.println(udp.sayi);
        udp.registerObserver(ro);
        //udp.getdatafromRemote();
       new loopThread(udp).start();
    }

}




