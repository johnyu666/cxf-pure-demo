package cxf.pure.client;

import cxf.pure.server.service.WetherService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class ClientNoStubApp {
    public static void main(String[] args) throws Exception{
        String address = "http://localhost:9001/wether?wsdl";
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress(address);
        // 设置接口类型
        jaxWsProxyFactoryBean.setServiceClass(WetherService.class);
        // 创建一个代理接口实现
        WetherService ws = (WetherService) jaxWsProxyFactoryBean.create();
        // 调用代理接口的方法调用并返回结果
        String result = ws.findCityByZipcode("111");
        System.out.println("返回结果:" + result);
    }
}
