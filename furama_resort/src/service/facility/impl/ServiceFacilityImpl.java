package service.facility.impl;

import model.Facility;
import repository.facility.IRepositoryFacility;
import repository.facility.impl.RepositoryFacilityImpl;
import service.facility.IServiceFacility;

import java.util.List;
import java.util.Map;

public class ServiceFacilityImpl implements IServiceFacility {

    private static final IRepositoryFacility facilityRepository=new RepositoryFacilityImpl();

    @Override
    public List<Facility> displayListFacilityMaintenance() {
        return facilityRepository.displayListFacilityMaintenance();
    }

    @Override
    public void addNew(Facility newFacility, int times) {
        facilityRepository.addNew(newFacility, times);
    }

    @Override
    public Map<Facility, Integer> getList() {
        return facilityRepository.getList();
    }

    @Override
    public void deleteFacility(String id) {
        facilityRepository.deleteFacility(id);
    }
}
