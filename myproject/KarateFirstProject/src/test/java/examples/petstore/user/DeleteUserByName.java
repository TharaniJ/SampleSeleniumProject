package examples.petstore.user;

import com.intuit.karate.junit5.Karate;

public class DeleteUserByName {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("DeleteUserByName").relativeTo(getClass());
    }
}
