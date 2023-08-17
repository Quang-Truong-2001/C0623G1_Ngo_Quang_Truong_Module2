package ss12_binarytree.productManager.controller;

import ss12_binarytree.productManager.service.IFunction;
import ss12_binarytree.productManager.service.impl.FunctionImpl;

public class Controller {
    public void optionFunctionProductManager(int option){
        IFunction iFunction=new FunctionImpl();
        switch (option){
            case 1:
                iFunction.addProduct();
                break;
            case 2:
                iFunction.editInfo();
                break;
            case 3:
                iFunction.delete();
                break;
            case 4:
                iFunction.display();
                break;
            case 5:
                iFunction.search();
                break;
            case 6:
                iFunction.sortUpProduct();
                break;
            case 7:
                iFunction.sortDownProduct();
                break;
        }
    }
}

