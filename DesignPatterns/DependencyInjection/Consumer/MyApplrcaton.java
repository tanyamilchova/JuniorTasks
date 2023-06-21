package DependencyInjection.Consumer;

import DependencyInjection.MassageService.MassageService;

public class MyApplrcaton implements Consumer{
    private MassageService service;
    public MyApplrcaton(MassageService svc){
        this.service=svc;
    }
    @Override
    public void processMassage(String msg, String rec) {
        this.service.sendMassage(msg, rec);
    }
}
