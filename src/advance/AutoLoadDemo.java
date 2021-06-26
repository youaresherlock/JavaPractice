package advance;

public class AutoLoadDemo {
    public static final String LOGGER = "org.apache.logging.log4j.Logger";

    public static void main(String[] args) {
        if(isClassPresent(AutoLoadDemo.LOGGER)){
//            factory = createLog4j();
        } else {
//            factory = cresateJdkLog();
        }
    }

    static boolean isClassPresent(String name){
        try{
            Class.forName(name);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}



























