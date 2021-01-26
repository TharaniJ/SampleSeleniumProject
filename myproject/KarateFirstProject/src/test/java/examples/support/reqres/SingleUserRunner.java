/*
API URL - https://reqres.in/#support-heading
 */

package examples.support.reqres;

import com.intuit.karate.junit5.Karate;

public class SingleUserRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("GetSingleUser").relativeTo(getClass());
    }
}
