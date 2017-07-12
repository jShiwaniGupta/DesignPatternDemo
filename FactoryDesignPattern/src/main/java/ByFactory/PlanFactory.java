package ByFactory;

import static ByFactory.PlanEnum.COMMERCIAL;
import static ByFactory.PlanEnum.DOMESTIC;
import static ByFactory.PlanEnum.INSTITUTIONAL;

public class PlanFactory {

    public Plan getPlan(PlanEnum plan) {

        switch (plan) {

            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                return null;
        }
    }

}
