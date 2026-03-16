package ObserverDesign.Observable;

import ObserverDesign.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obj);

    public void remove (NotificationAlertObserver obj);

    public void notifySub();

    public int setData(int data);
}
