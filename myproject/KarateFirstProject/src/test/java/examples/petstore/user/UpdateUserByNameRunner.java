package examples.petstore.user;

import com.intuit.karate.junit5.Karate;

public class UpdateUserByNameRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("UpdateUserByName").relativeTo(getClass());
    }
}
