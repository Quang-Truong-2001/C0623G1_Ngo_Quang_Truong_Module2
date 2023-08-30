package controller.facility;

import model.Facility;
import service.facility.IServiceFacility;
import service.facility.impl.ServiceFacilityImpl;

import java.util.List;
import java.util.Map;

public class FacilityController {
    private static final IServiceFacility serviceFacility=new ServiceFacilityImpl();

    public List<Facility> displayListFacilityMaintenance() {
        return serviceFacility.displayListFacilityMaintenance();
    }


    public void addNew(Facility newFacility, int times) {
        serviceFacility.addNew(newFacility, times);
    }


    public Map<Facility, Integer> getList() {
        return serviceFacility.getList();
    }


    public void deleteFacility(String id) {
        serviceFacility.deleteFacility(id);
    }
}
