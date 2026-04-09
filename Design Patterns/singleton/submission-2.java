static class Singleton {
    private static String value = null;
    private static Singleton instance;
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (value == null) {
            instance = new Singleton();
            return instance;
        } else {
            return instance;
        }
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
