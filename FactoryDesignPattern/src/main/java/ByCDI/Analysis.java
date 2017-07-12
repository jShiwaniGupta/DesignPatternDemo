package ByCDI;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class Analysis {

    public Analysis() {
        System.out.println("Constructor is called...");
    }

    @Inject
    @Domestic
    private Plan plan;

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct is called...");
        System.out.println("Get Rate" + plan.getRate());
    }
}
