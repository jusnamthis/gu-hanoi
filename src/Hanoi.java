public class Hanoi {
    public static void main(String[] args) {
        Hanoi.moveBlocks(6, 1, 3);
    }

    public static void moveBlocks(int blockNum, int startTower, int finishTower) {
        if (blockNum <= 0) {
            return;
        }
        int tempTower = 6 - (startTower + finishTower);
        Hanoi.moveBlocks(blockNum - 1, startTower, tempTower); //move upper blocks to temporary tower
        System.out.println("Moving block " + blockNum + " from " + startTower + " to " + finishTower + " tower");
        Hanoi.moveBlocks(blockNum - 1, tempTower, finishTower); // move upper blocks from temporary to finish tower
    }
}
