package DependencyInjection.Injector;

import DependencyInjection.Consumer.Consumer;
import DependencyInjection.Consumer.MyApplrcaton;
import DependencyInjection.MassageService.SMSService;

public class SMSServiceInjector implements MassageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyApplrcaton(new SMSService());
    }
}
