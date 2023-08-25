package service.facility;

import model.Facility;
import service.IService;

import java.util.List;

public interface IServiceFacility extends IService<Facility> {
    List<Facility> displayListFacilityMaintenance();
    void deleteFacility(String id);
}
