package core;

import static core.PlanEnum.COMMERCIAL;
import static core.PlanEnum.DOMESTIC;
import static core.PlanEnum.INSTITUTIONAL;

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
