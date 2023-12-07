package com.saamuah.googleapi.controllers;


import com.saamuah.googleapi.services.GoogleApiService;
import com.saamuah.googleapi.util.GoogleApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

@RestController
public class DashboardController {

    @Autowired
    private GoogleApiService googleApiService;


    @GetMapping("/ping")
    public String ping(){
        return "OK";
    }


    @GetMapping("/getData")
    public Map<Object, Object> readDataFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiService.readDatFromGoogleSheet();
    }


}
