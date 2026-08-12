static class Singleton {
    private String value;

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    return instance;
                }
            }
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        synchronized(Singleton.class) {
            this.value = value;
        }
    }
    
}
