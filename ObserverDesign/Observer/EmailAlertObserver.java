package ObserverDesign.Observer;

import ObserverDesign.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    StockObservable obj;
    EmailAlertObserver(StockObservable obj) {
        this.obj = obj;
    }
    public void update() {
        System.out.println("Current stock: " + obj.setData(10));
    }
}
