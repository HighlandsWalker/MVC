package ro.teamnet.zth.appl.controller;

import oracle.jdbc.proxy.annotation.Methods;
import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Gabriel.Tabus on 7/20/2017.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    @MyRequestMethod(urlPath = "/all", methodType = "GET")
    private String getAllEmployees(){
        return "allEmployees";
    }

    @MyRequestMethod(urlPath = "/one", methodType = "GET")
    private String getOneEmployee(){
        return "oneRandomEmployee";
    }
}
