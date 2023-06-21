package DependencyInjection.Injector;

import DependencyInjection.Consumer.Consumer;
import DependencyInjection.Consumer.MyApplrcaton;
import DependencyInjection.MassageService.EmailService;

public class EmailServiceInjector implements MassageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyApplrcaton(new EmailService());
    }
}
