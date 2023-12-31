package repository.facility;

import model.Facility;
import repository.IRepository;

import java.util.List;
import java.util.Map;

public interface IRepositoryFacility {
    List<Facility> displayListFacilityMaintenance();
    void addNew(Facility newFacility,int times);
    Map<Facility,Integer> getList();
    void deleteFacility(String id);

}
