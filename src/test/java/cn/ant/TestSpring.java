package cn.ant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
@ContextConfiguration(locations = { "classpath:spring-test-conf.xml" })
public class TestSpring extends AbstractTestNGSpringContextTests {

    @Autowired
    EmailGenerator emailGenerator;

    @Test()
    void testEmailGenerator() {

        String email = emailGenerator.generate();
        System.out.println(email);

        //Assert.assertNotNull(email);
        Assert.assertEquals(email, "cdd@163.com");


    }

}
