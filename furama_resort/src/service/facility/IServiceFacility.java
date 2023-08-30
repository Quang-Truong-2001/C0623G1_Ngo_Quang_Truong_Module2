package service.facility;

import model.Facility;
import service.IService;


import java.util.List;
import java.util.Map;

public interface IServiceFacility {
    List<Facility> displayListFacilityMaintenance();
    void addNew(Facility newFacility,int times);
    Map<Facility,Integer> getList();
    void deleteFacility(String id);
}
