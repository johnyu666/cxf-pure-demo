package cxf.pure.server.service.impl;

import cxf.pure.server.service.WetherService;

public class WetherServiceImpl implements WetherService {
    @Override
    public String findCityByZipcode(String zipcode) {
        return "city+"+zipcode;
    }
}
