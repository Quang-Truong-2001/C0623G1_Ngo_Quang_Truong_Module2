package controller.facility;

import model.Facility;

import java.util.Map;

public interface IFacilityController {
    Map<Facility,Integer> displayListFacilityMaintenance();
    void addNew(Facility newFacility,int times);
    Map<Facility,Integer> getList();
    void deleteFacility(String id);
}
