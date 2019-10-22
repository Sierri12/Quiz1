import java.time.LocalDate;

public class Zad_1 {
    //napisz metodę zwracającą ilość wtorków w danym miesiącu.
    public static void main(String[] args) {
        System.out.println("Ilość wtorków: "+iloscWtorkow(2019,10));

    }

    public static int iloscWtorkow(int rok, int miesiac){
        LocalDate data=LocalDate.of(rok,miesiac,1);

        int x=0;
        for(int i=1;i<=data.lengthOfMonth();i++){
            LocalDate dzien=LocalDate.of(rok,miesiac,i);

            if(dzien.getDayOfWeek().getValue()==2){
                x++;
            }
        }
return x;
    }

}
