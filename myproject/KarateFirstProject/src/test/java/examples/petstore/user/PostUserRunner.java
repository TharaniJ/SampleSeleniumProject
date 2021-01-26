package examples.petstore.user;

import com.intuit.karate.junit5.Karate;

public class PostUserRunner {
    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("PostUser").relativeTo(getClass());
    }
}
