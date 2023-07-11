public class User {
    public void login(String username, String password) {
        //System.out.printf("Login Service");
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("TEST", "TEST", "TEST"); 
    }
}

class EmailService {
    public void sendEmail(String to, String subject, String body) {
        System.out.printf("Email Service");
    }
}
