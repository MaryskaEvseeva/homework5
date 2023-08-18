package runetology;
public class Conditioner {
    private int currentTemperature;

    public int getCurrentTemperature(){
        return currentTemperature;
    }
    public void setCurrentTemperature(int newCurrentTemperature){
        if (newCurrentTemperature < 0){
            return;
        }
        if (newCurrentTemperature > 50){
            return;
        }
        currentTemperature = newCurrentTemperature;
    }
    public void increaseTemp50p(){
        int target;
        target = currentTemperature * 3 / 2;
        currentTemperature =target;
    }
    public void setToMaxTemp (){
        currentTemperature = 30;
    }
   }