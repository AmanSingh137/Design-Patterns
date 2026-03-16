package ObserverDesign.Observable;

import java.util.List;
import java.util.ArrayList;

import ObserverDesign.Observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable{
    public List<NotificationAlertObserver> ls = new ArrayList<>();
    public int stockCount = 8;

    @Override 
    public void add(NotificationAlertObserver obj) {
        ls.add(obj);
    }

    @Override 
    public void remove(NotificationAlertObserver obj) {
        ls.remove(obj);
    }

    @Override
    public void notifySub() {
        for (NotificationAlertObserver obj : ls) {
            obj.update();
        }
    }

    @Override
    public int setData (int t) {
        stockCount = t;
        notifySub();
        return t;
    }

    public int getStockCount() {
        return stockCount;
    }
}
