package service.booking_contract;

import model.Contract;
import service.IService;


public interface IServiceContract extends IService<Contract> {
    void updateContract(Contract contract);
}
