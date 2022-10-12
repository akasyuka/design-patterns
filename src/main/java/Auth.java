public class Auth {

    private Connect connect;

    public Auth(Connect connect) {
        this.connect = connect;
    }

    void startConnect() {
        connect.getCredentials();
    }

}
