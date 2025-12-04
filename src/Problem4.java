public class Problem4 extends ConsoleProgram {
    @Override
    public void run() {
        int[] averages = {81, 90, 99, 78, 77, 94, 99,999,999};
        int total = 0;
        for (int mark : averages){
            if (mark> 80) {
                total ++;
            }
        }
        print("Total # = "+total);
    }
}
