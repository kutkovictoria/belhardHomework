package vehicles.lorries;

public class LorryBack {
    double loryBackSize;
    String lorryBackType;

    public LorryBack(double loryBackSize, String lorryBackType) {
        this.loryBackSize = loryBackSize;
        this.lorryBackType = lorryBackType;
    }

    public double getLoryBackSize() {
        return loryBackSize;
    }

    public String getLorryBackType() {
        return lorryBackType;
    }
}
