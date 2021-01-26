package examples.petstore.pet;

import com.intuit.karate.junit5.Karate;

public class GetPetByStatusRunner {

    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("GetPetByStatus").relativeTo(getClass());
    }
}
