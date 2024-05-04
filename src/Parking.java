public class Parking {
    private final Lot[][] lots = new Lot[4][5]; //4 levels and 5 rows of parking lots

    public Parking() {
        int lotNum = 1;
        for(int level = 0; level < lots.length; level++) {
            for (int row = 0; row < lots[0].length; row++) {
                lots[level][row] = new Lot(lotNum);
                lotNum++;
            }
        }
        lots[0][1] = lots[0][1].parkCar(new Car("hjcbs", "dshbjm"));
        lots[2][4] = lots[2][4].parkCar(new Car("juksnd", "dshbjfaes aewgm"));
    }

    public void printAvLots() {
        System.out.println("Available cars lots are:- (* for lot not available)");
        for (int i = 0; i < lots.length; i++) {
            for (int j = 0; j < lots[0].length; j++) {
                Lot lot = lots[i][j];
                if (lot.getParkedCar() == null) {
                    System.out.print(lot.getLotNum() + "\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

}
