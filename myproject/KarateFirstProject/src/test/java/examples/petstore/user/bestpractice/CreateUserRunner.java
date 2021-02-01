package examples.petstore.user.bestpractice;

import com.intuit.karate.junit5.Karate;

public class CreateUserRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("CreateUser").relativeTo(getClass());
    }
}
