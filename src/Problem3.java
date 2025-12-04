public class Problem3 extends ConsoleProgram {
    @Override
    public void run() {
        double total = 0;

        double[] averages = new double[5];
        for (int i = 0; i<averages.length; i++){
            averages[i] = readDouble("Enter numbers: ");
        }
        print(averages[2]);
        for(double temp : averages){
            total += temp;
        }
        print("average is: "+total/averages.length);
    }
}
