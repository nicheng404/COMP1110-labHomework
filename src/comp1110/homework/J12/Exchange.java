package comp1110.homework.J12;

public class Exchange {
    public static <T> T[] swap(T[] a, int i, int j){
        int range = a.length-1;
        if(i<0 || j<0||i>range||j>range){
        } else {
            T trans = a[i];
            a[i]=a[j];
            a[j]=trans;
        }
        return a;
    }
}
