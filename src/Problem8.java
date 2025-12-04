public class Problem8 extends ConsoleProgram {
    @Override
    public void run() {
        int[] Original = {3, 9, 1, 4, 7};
        int[] Reversed  = new int[Original.length];
        for (int i = 0; i<Original.length; i++){
            Reversed[i] = Original[Original.length-i-1];
        }
        for (int i = 0; i<Original.length; i++){
            print(Original[i] + " ");
        }
        println();
        for (int i = 0; i<Original.length; i++){
            print(Reversed[i] + " ");
        }
    }
}
