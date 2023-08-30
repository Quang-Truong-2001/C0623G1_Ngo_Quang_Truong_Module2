package repository.facility.impl;

import model.Facility;
import model.House;
import model.Room;
import model.Villa;
import repository.facility.IRepositoryFacility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RepositoryFacilityImpl implements IRepositoryFacility {

    private static Map<Facility, Integer> facility=new LinkedHashMap<>();
    static {
        facility.put(new Villa("SVVL-0001","A",40,2000,2,"DAY","B",20,4),4);
        facility.put(new House("SVHO-0002","B",30,3000,4,"MONTH","E",5),5);
        facility.put(new Room("SVRO-0003","C",50,4000,3,"MONTH","F"),6);
    }

    @Override
    public List<Facility> displayListFacilityMaintenance() {
        List<Facility> list=new ArrayList<>();
        for(Map.Entry<Facility, Integer> entry: facility.entrySet()){
            if(entry.getValue()>5){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    @Override
    public void addNew(Facility newFacility, int times) {
        facility.put(newFacility,times);
    }


    @Override
    public Map<Facility, Integer> getList() {
        return facility;
    }

    @Override
    public void deleteFacility(String id) {
        for(Map.Entry<Facility, Integer> entry: facility.entrySet()){
            if(entry.getKey().equals(id)){
                facility.remove(entry.getKey());
                break;
            }
        }
    }
}
