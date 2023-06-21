package DependencyInjection.MassageService;

public class EmailService implements MassageService{
    @Override
    public void sendMassage(String msg, String rec) {
        System.out.println("Email sent to "+rec+ " with massage "+msg);

    }
}
