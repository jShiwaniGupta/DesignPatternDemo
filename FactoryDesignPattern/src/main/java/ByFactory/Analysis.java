package ByFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Analysis {

    public Analysis() {
        System.out.println("Constructor is called... ");
    }

    private Plan plan;
    private PlanFactory pf;

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct is called...");

        plan = pf.getPlan(PlanEnum.COMMERCIAL);
        System.out.println("Get Rate ## " + plan.getRate());
    }
}
