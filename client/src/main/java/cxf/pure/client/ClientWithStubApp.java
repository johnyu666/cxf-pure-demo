package cxf.pure.client;


import cxf.pure.client.stub.WetherServiceService;

public class ClientWithStubApp {
    public static void main(String[] args) {
        WetherServiceService wss=new WetherServiceService();
        String city=wss.getWetherServicePort().findCityByZipcode("1111");
        System.out.println(city);
    }
}
