package controller.facility.impl;

import controller.facility.IFacilityController;
import model.Facility;
import service.facility.IServiceFacility;
import service.facility.impl.ServiceFacilityImpl;

import java.util.Map;

public class FacilityControllerImpl implements IFacilityController {
    private static final IServiceFacility serviceFacility=new ServiceFacilityImpl();
    @Override
    public Map<Facility, Integer> displayListFacilityMaintenance() {
        return serviceFacility.displayListFacilityMaintenance();
    }

    @Override
    public void addNew(Facility newFacility, int times) {
        serviceFacility.addNew(newFacility, times);
    }

    @Override
    public Map<Facility, Integer> getList() {
        return serviceFacility.getList();
    }

    @Override
    public void deleteFacility(String id) {
        serviceFacility.deleteFacility(id);
    }
}
