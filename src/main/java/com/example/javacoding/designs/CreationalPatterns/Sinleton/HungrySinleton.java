public class HungrySinleton {
    private static final HungrySingleton intance = new HungrySinleton();

    private HungrySinleton() {}

    public static HungrySinleton getInstance() {
        return intance;
    }
}