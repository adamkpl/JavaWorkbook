package com.javafortesters;

import com.javafortesters.domainobject.WebAddress;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WebAddressTest {
    @Test
    public void canGetWebUrl() {
        assertEquals("Returns URL","https://javafortesters.com/", WebAddress.getUrl());
    }

    @Test
    public void canGetWebIpAndPort() {
        assertEquals("Returns IP","185.119.173.30", WebAddress.getIp());
        assertEquals("Returns PORT","80", WebAddress.getPort());
    }
}