public class Problem6 extends ConsoleProgram {
    @Override
    public void run() {
        double[] prices = {5.99, 3.50, 12.00, 1.25};
        double total=0;
        for (double price: prices){
            total += price;
        }
        print(total);
    }
}
