package com.mcakir.test;

import com.mcakir.aop.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/test-context.xml")
public class AppTest {

    @Autowired
    Person person;

    @Test
    public void testMethodLogger() {

        person.ask("Jane");
        person.bye();
    }

}
