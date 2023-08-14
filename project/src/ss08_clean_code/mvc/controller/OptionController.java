package ss08_clean_code.mvc.controller;

import ss08_clean_code.mvc.service.IFunction;
import ss08_clean_code.mvc.service.IOptionService;
import ss08_clean_code.mvc.service.impl.FunctionImpl;
import ss08_clean_code.mvc.service.impl.OptionServiceIpml;

public class OptionController {
    public void optionFunction(int select, int option) throws Exception{
        IOptionService optionService=new OptionServiceIpml();
        optionService.selectService(select);
        optionService.optionService(option);
        IFunction iFunction=new FunctionImpl();
        switch(option){
            case 1:
                iFunction.add(select);
                break;
            case 2:
                iFunction.delete(select);
                break;
            case 3:
                iFunction.displayList(select);
                break;
        }
    }
}
