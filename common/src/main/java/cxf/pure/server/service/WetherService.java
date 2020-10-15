package cxf.pure.server.service;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface WetherService{
    String findCityByZipcode(String zipcode);
}
