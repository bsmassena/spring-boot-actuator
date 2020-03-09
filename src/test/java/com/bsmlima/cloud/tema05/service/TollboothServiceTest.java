package com.bsmlima.cloud.tema05.service;

import com.bsmlima.cloud.tema05.application.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class TollboothServiceTest {
    private static final double DOUBLE_THRESHOLD = 0.0001;

    @Autowired
    private TollboothService ts;

    @Test
    public void testDoTollboothPaymentWithoutAxles() {
        assertEquals(0, ts.doTollboothPayment("beetle", 2.11), DOUBLE_THRESHOLD);
        assertEquals(0, ts.doTollboothPayment("bike", 0.49), DOUBLE_THRESHOLD);
        assertEquals(0, ts.doTollboothPayment("bus", 1.59), DOUBLE_THRESHOLD);
        assertEquals(0, ts.doTollboothPayment("motorcycle", 1), DOUBLE_THRESHOLD);
    }

    @Test
    public void testDoTollboothPaymentWithAxles() {
        assertEquals(0, ts.doTollboothPayment("truck", 6.95, 3), DOUBLE_THRESHOLD);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoTollboothPaymentWithoutEnoughValue() {
        ts.doTollboothPayment("beetle", 1.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoTollboothPaymentTruckWithoutAxles() {
        ts.doTollboothPayment("truck", 3.95);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoTollboothPaymentBikeWithAxles() {
        ts.doTollboothPayment("bike", 3.95, 3);
    }
}