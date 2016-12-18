package lab.aikibo.spring;

import lab.aikibo.config.AppConfig;
import lab.aikibo.model.Order;
import lab.aikibo.service.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


/**
 * Created by tamami on 18/12/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=AppConfig.class)
public class JUnitSpringTest {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testSampleService() {
        assertEquals("class lab.aikibo.service.SampleServiceImpl",
                this.sampleService.getClass().toString());
    }

    @Test
    public void testSampleServiceGetAccountDescription() {
        // check if the return description has a description: string.
        assertTrue(sampleService.getOrderDescription().contains("Description:"));
    }

    @Test
    public void testSampleServiceGetAccountCode() {
        // check if the return description has a Code: string.
        assertTrue(sampleService.getOrderStringCode().contains("Code:"));
    }

    @Test
    public void testSampleServiceCreateNewOrder() {
        Order newOrder = new Order();
        newOrder.setSecurityCode("XYZ");
        newOrder.setDescription("Description");
        if(newOrder != null) {
            assertThat(sampleService.createOrder(newOrder), instanceOf(Order.class));
            assertNotNull("Security isn't null", newOrder.getSecurityCode());
            assertNotNull("Description isn't not null", newOrder.getDescription());
        }
        assertNotNull("New Order is not null", newOrder);
    }

    @Test
    public void testSampleServiceGetOrder() {
        Order existingOrder = sampleService.getOrder(0);
        if(existingOrder != null) {
            assertThat(sampleService.getOrder(0), instanceOf(Order.class));
            assertNotNull("Security isn't null", existingOrder.getSecurityCode());
            assertNotNull("Description isn't null", existingOrder.getDescription());
        }
        assertNotNull("Object is not null", existingOrder);
    }

}
