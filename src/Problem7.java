public class Problem7 extends ConsoleProgram {
    @Override
    public void run() {
        String[] firstNames = {"Amy", "Ben", "Chris", "Dana"};
        String[] lastNames  = {"Lee", "Wong", "Wong", "Patel"};
        String search = readLine("Enter desired person: ");
        for(int i =0; i<lastNames.length; i++){
            if (lastNames[i].equals(search)){
                println(firstNames[i]+" "+lastNames[i]);
            }
        }
    }
}
