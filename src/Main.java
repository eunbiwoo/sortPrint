public class Main {

    public static void main(String[] args) {

        Machine machine = new Machine();

        machine.insert(1);
        machine.insert(16);
        machine.insert(7);
        machine.insert(4);
        machine.insert(5);

        machine.selection(new BubbleSortSortPrinter());
        machine.run();
        machine.show();


        machine.selection(new SelectionSortSortPrinter());
        machine.run();
        machine.show();
    }
}
