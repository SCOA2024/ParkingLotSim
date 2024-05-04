public class Lot {
    private final int lotNum;
    private Car parkedCar = null;

    public int getLotNum() {
        return lotNum;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public Lot parkCar(Car car) {
        this.setParkedCar(car);
        return this;
    }

    public Lot(int lotNum) {
        this.lotNum = lotNum;
    }
}
