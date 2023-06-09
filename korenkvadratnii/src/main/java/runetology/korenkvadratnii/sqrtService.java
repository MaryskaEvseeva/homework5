package runetology.korenkvadratnii;

public class sqrtService {
    public int calcsqrt(int x) {
        for (int i = 1; i <= x; i++){
            if (i * i >= x) {
                return i;
            }
    }
    return -1;

}}

