public class Problem2 extends ConsoleProgram {
    @Override
    public void run() {
        String[] names = {"Ana", "Ben", "Ming", "Lila", "Kai"};
        int[] scores = {12, 22, 18, 31, 15};

        int highest = 0;
        String name = names[0];
        print(names[top(names, scores, highest)] +" "+ scores[top(names, scores, highest)]);
    }
    private int top(String[] names, int[] scores, int highest){
        for (int i = 1; i<scores.length; i++){
            if (scores[i]>scores[highest]){
                highest = i;
            }
        }
        return highest;
    }
}
