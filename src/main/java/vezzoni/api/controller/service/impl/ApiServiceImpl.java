package vezzoni.api.controller.service.impl;

import org.springframework.stereotype.Service;
import vezzoni.api.controller.service.ApiService;

@Service
public class ApiServiceImpl implements ApiService {

    @Override
    public String greetings(String name) {
        return String.format("Hello %s!", name);
    }

    @Override
    public void insert(Integer id) {
        // do nothing, for while at least
    }
    
}
