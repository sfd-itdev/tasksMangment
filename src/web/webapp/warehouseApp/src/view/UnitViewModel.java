package sa.gov.sfd.taskManagementDeliveryMechanism.view;

import sa.gov.sfd.tasksMangment.model.unit.*;

public class UnitViewModel {
    private UnitId unitId;
    private UnitName unitName;

    public UnitViewModel(UnitId unitId, UnitName unitName) {
        this.unitId = unitId;
        this.unitName = unitName;
    }

    public UnitId getUnitId() {
        return unitId;
    }

    public UnitName getUnitName() {
        return unitName;
    }
}
