package foundation;

public class Permission {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());
        System.setProperty("java.version", "1.7.0_45");
        String javaNewVersion = System.getProperty("java.version");
        System.err.println(javaNewVersion);
    }
}
