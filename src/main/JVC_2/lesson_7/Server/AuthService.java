package JVC_2.lesson_7.Server;

public interface AuthService {
    void start();
    String getNickByLoginPass(String login, String pass);
    void stop();
}