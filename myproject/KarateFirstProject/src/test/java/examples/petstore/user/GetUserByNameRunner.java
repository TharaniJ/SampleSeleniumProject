package examples.petstore.user;

import com.intuit.karate.junit5.Karate;

public class GetUserByNameRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("GetUserByName").relativeTo(getClass());
    }
}
