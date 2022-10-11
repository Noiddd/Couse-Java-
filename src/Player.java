public class Player {
    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean isDuplexPrinter;

    public Player(int tonerLevel, int numberPagesPrinted, boolean isDuplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberPagesPrinted = numberPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int addToner(int addAmount){
        if(addAmount > 0 && addAmount <= 100){
           if(this.tonerLevel + addAmount > 100){
               return -1;
           }
           this.tonerLevel += addAmount;
           return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
