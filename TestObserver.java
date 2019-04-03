public class TestObserver implements RepositoryObserver {

    public TestObserver(RepositoryObserver observer){
    observer=observer;

    }
    @Override
    public void onUserDaraChanged(String fullname, int age) {


    }
}
