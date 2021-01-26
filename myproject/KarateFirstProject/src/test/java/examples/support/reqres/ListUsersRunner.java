/*
API URL - https://reqres.in/#support-heading
 */

package examples.support.reqres;

import com.intuit.karate.junit5.Karate;

public class ListUsersRunner {

    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("GetListUsers").relativeTo(getClass());
    }

}
