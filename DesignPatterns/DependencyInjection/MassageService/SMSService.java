package DependencyInjection.MassageService;

import DependencyInjection.MassageService.MassageService;

public class SMSService implements MassageService {
    @Override
    public void sendMassage(String msg, String rec) {
        System.out.println("SMS sent to "+rec+" with massage "+msg);

    }
}
