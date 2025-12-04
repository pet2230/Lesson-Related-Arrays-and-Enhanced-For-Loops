public class Problem1 extends ConsoleProgram {
    @Override
    public void run() {
        String[] names = {"Ana", "Ben", "Ming", "Lila", "Kai"};
        int[] scores = {12, 22, 18, 31, 15};    
        nameWscore(names, scores);
    }
    private void nameWscore(String[] names, int[] scores){
    for (int i = 0; i<names.length; i++){
        print(names[i]+":");
        for (int n = 0; n<10-names[i].length(); n++){
            print(" ");
    }
    print(scores[i]);
    println();
}

}
}
