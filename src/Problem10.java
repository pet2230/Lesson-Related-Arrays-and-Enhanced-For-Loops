public class Problem10 extends ConsoleProgram {
    @Override
    public void run() {
        String[] items = {"Pen", "Notebook", "Eraser", "Pencil"};
        double[] costs = {1.25, 3.50, 0.99, 0.75};
        String wanted = readLine("What: ");
        
        print(costs[place(items, wanted)]);
        

        }
    private int place(String[] items, String wanted){
    for (int i = 0; i<items.length; i++){
        if(items[i].equals(wanted)){
            return i;
        }
    }
    throw new IllegalArgumentException("Item not found");
}

}