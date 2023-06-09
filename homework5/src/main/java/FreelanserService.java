public class FreelanserService {
public int calculate ( int income, int expense, int threshold){
    int money = 0;

    int monthsRest = 0;

    for (int i = 0; i < 12; i++) {
        if (money >= threshold){
            // отдыхаем
            money -= expense;
            money /= 3;
            monthsRest ++;
        } else {
            // работаем
            money += income;
            money -= expense;
        }
        
    }
    return monthsRest;
}
}
