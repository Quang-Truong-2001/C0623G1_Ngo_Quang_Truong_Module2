package ss08_clean_code.mvc.controller;

import ss08_clean_code.mvc.model.Student;
import ss08_clean_code.mvc.repository.IStudentRepository;
import ss08_clean_code.mvc.repository.ITeacherRepository;
import ss08_clean_code.mvc.repository.impl.StudentReponsitoryImpl;
import ss08_clean_code.mvc.repository.impl.TeacherRepositoryImpl;
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
                if (select == 1) {
                    iFunction.addInfo(1);
                } else if (select == 2) {
                    iFunction.addInfo(2);
                }
                break;
            case 2:
                iFunction.delete(select);
                break;
            case 3:
                if (select == 1) {
                    iFunction.displayList(1);
                } else if (select == 2) {
                    iFunction.displayList(2);
                }
                break;
        }
    }
}
