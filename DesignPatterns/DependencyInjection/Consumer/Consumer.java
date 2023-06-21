package DependencyInjection.Consumer;

import DependencyInjection.MassageService.MassageService;

public interface Consumer {
   void processMassage(String msg,String rec);
}
