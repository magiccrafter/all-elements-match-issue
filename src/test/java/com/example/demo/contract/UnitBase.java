package com.example.demo.contract;

import com.example.demo.TestController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public abstract class UnitBase {

    @InjectMocks
    TestController testController;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(testController);
    }
}
