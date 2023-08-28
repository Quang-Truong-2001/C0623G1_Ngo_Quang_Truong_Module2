package repository.facility;

import model.Facility;
import repository.IRepository;

import java.util.List;

public interface IRepositoryFacility extends IRepository<Facility> {
    List<Facility> displayListFacilityMaintenance();
    void deleteFacility(String id);
}
