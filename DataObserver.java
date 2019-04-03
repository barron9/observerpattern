public interface DataObserver {
    void registerObserver(RepositoryObserver repositoryObserver);
    void removeObserver(RepositoryObserver repositoryObserver);
    void notifyObservers();
}
