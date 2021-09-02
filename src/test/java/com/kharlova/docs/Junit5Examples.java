package com.kharlova.docs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Examples {

    @BeforeEach
    void beforEach() {
        System.out.println("Befor test!");
    }


    @Test
    void firstTest(){
        System.out.println("I love you QA.GURU");
    }
}
