package com.example.Labration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValidatorTests {

    Validator val = new Validator();

    @Test
    void isNotValidNum () {
        boolean expected = false;
        boolean actual = Validator.isPhoneNumberValid("8423232323");

        Assertions.assertEquals(expected,actual);


    }


}
