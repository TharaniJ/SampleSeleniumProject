package examples.petstore.pet;

import com.intuit.karate.junit5.Karate;

public class PostPetRunner {

    @Karate.Test
    Karate testUsers() {

        return new Karate().feature("PostPet").relativeTo(getClass());
    }

}
