package com.javafortesters;

import com.javafortesters.domainobject.WebAddress;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
@Link("https://github.com/adamkpl/JavaWorkbook")
@Link(name = "JavaWorkbook on GitHub.com", type = "Repository")
public class WebAddressTest {

    private static URL url;

    static {
        try {
            url = new URL(WebAddress.javaForTesters);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Return Protocol")
    @Description("Gets the protocol name of this URL.")
    public void canGetProtocol() {
        assertEquals("Protocol name is HTTPS", "https", url.getProtocol());
    }

    @Test
    @DisplayName("Return Host")
    @Description("Gets the host name of this URL, if applicable.")
    public void canGetHost() {
        assertEquals("Protocol host name is " + url, "www.javafortesters.com", url.getHost());
    }

    @Test
    @DisplayName("Return Authority")
    @Description("Gets the authority part of this URL.")
    public void canGetAuthority() {
        assertEquals("Authority is " + url, "www.javafortesters.com", url.getAuthority());
    }

}