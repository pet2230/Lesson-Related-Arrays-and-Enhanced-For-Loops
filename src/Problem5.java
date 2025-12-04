public class Problem5 extends ConsoleProgram {
    @Override
    public void run() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] days    = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthC  = readLine("What moneth: ");
        for(int i = 0; i<months.length; i++){
            if (months[i].equals(monthC)){
                print(months[i] +": " +days[i]);
            }
        }
    }
}
