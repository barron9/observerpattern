

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting!");
        RepositoryObserver ro =new RepositoryObserver() {
            @Override
            public void onUserDaraChanged(String fullname, int age) {
                System.out.println(fullname);

            }
        };
        UserDataProcessor udp = UserDataProcessor.getInstance();
        System.out.println(udp.sayi);
        udp.registerObserver(ro);
        udp.getdatafromRemote();
    }

}




