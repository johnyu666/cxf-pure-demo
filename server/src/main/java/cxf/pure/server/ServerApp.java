package cxf.pure.server;

import cxf.pure.server.service.WetherService;
import cxf.pure.server.service.impl.WetherServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class ServerApp {
    public static void main(String[] args) {
        String address = "http://localhost:9001/wether";
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress(address);
        jaxWsServerFactoryBean.setServiceClass(WetherService.class);
        jaxWsServerFactoryBean.setServiceBean(new WetherServiceImpl());
        jaxWsServerFactoryBean.create();
//        或者
//        Endpoint.publish(address,new WetherServiceImpl());
    }
}

