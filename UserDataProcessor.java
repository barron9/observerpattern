import java.util.ArrayList;

public class UserDataProcessor implements DataObserver {
    public int sayi = 3;
    private static UserDataProcessor INSTANCE = null;
    private ArrayList<RepositoryObserver> mObservers;
    private String mFullName;
    private int mAge;

    public UserDataProcessor() {
        mObservers = new ArrayList<>();
        getdatafromRemote();
    }

    public void getdatafromRemote() {
        setUserData("Chike Mgbemena", 101);
    }

    public static UserDataProcessor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserDataProcessor();
        }
        return INSTANCE;
    }

    @Override
    public void registerObserver(RepositoryObserver repositoryObserver) {
        if (!mObservers.contains(repositoryObserver)) {
            mObservers.add(repositoryObserver);
            mObservers.size();
        }
    }

    @Override
    public void removeObserver(RepositoryObserver repositoryObserver) {

    }

    @Override
    public void notifyObservers() {
        for (RepositoryObserver observer : mObservers) {
            observer.onUserDaraChanged(mFullName, mAge);
        }

    }

    public void setUserData(String name, int sayi) {
        mFullName = name;
        mAge = sayi;
        notifyObservers();

        //observer.onUserDaraChanged(name,sayi);
    }
}
