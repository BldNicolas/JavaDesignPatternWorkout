package dp.observer;

import dp.observer.structure.Observer;

public class DisplayDevice implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}
