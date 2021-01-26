package examples.petstore.pet;

import com.intuit.karate.junit5.Karate;

public class GetPetByIDRunner {

    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("GetPetByID").relativeTo(getClass());
    }
}
