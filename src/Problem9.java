public class Problem9 extends ConsoleProgram {
    @Override
    public void run() {
        int[] nums = {3, 10, 4, 7, 12, 5};
        int total = 0;
        for (int num:nums){
            if (num%2==0){
                total ++;
            }
        }
        print("Even total is: " + total);
    }
}
