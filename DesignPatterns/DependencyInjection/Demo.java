package DependencyInjection;

import DependencyInjection.Consumer.Consumer;
import DependencyInjection.Injector.EmailServiceInjector;
import DependencyInjection.Injector.MassageServiceInjector;
import DependencyInjection.Injector.SMSServiceInjector;

public class Demo {
    public static void main(String[] args) {
        String msg="Hi! I'm Tanya!";
        String email="margot11margot11@gmail.com";
        String phone="+359878200950";
        MassageServiceInjector injector=null;
        Consumer app=null;

        injector=new EmailServiceInjector();
        app=injector.getConsumer();
        app.processMassage(msg,email);

        injector=new SMSServiceInjector();
        app=injector.getConsumer();
        app.processMassage(msg,phone);

    }
}
