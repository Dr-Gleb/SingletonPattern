public class SingletonClass {
    private static SingletonClass instance = null;
    private SingletonClass(){
        System.out.println("instanse created");
    };
    public  static SingletonClass getInstance(){
        if(instance==null){
            synchronized (SingletonClass.class){
                if(instance==null){
                    instance=new SingletonClass();
                }
            }
        }
        return  instance;
    }
}
