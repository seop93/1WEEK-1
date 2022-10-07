package Java_1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public int getFromSido() {
        return fromSido;
    }

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
}
