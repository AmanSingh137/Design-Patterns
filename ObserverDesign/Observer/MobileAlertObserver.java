package ObserverDesign.Observer;

import ObserverDesign.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    StockObservable obj;
    MobileAlertObserver (StockObservable obj) {
        this.obj = obj;
    }
    public void update() {
        
    }
}
