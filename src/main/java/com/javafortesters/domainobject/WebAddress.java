package com.javafortesters.domainobject;

import java.net.Inet4Address;
import java.net.URL;

public class WebAddress {

    private URL url;
    private Inet4Address ip;

    public static final String javaForTesters = "https://www.javafortesters.com/";
    public static final String javaForTestersBook = "https://www.javafortesters.com/page/about/";
    public static final String javaForTestersIp = "185.119.173.30";

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Inet4Address getIp() {
        return ip;
    }

    public void setIp(Inet4Address ip) {
        this.ip = ip;
    }

}