public class DI {
    public static void main(String[] args) {

        Auth auth = new Auth(new FromFileSystem());
        auth.connect.getCredentials();
    }
}
