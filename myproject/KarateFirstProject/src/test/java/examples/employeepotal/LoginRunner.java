package examples.employeepotal;

import com.intuit.karate.junit5.Karate;

public class LoginRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("EmployeeLogin").relativeTo(getClass());
    }
}
