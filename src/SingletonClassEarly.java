public  class SingletonClassEarly {
    private static final SingletonClassEarly INSTANCE = new SingletonClassEarly();
    private SingletonClassEarly(){
        System.out.println("instance created");
    }
    public static SingletonClassEarly getInstance(){
        return INSTANCE;
    }
}
