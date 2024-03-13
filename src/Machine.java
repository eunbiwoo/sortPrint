import java.util.ArrayList;

public class Machine {
    SortPrinter sortPrinter;
    private ArrayList<Integer> lst = new ArrayList<>();


    public void insert(int num) {
        lst.add(num);
    }

    void selection(SortPrinter sortPrinter){
        this.sortPrinter = sortPrinter;
    }

    public void run(){
        sortPrinter.run(lst);
    }


    public void show(){
        System.out.println(lst.toString());
    }
}
