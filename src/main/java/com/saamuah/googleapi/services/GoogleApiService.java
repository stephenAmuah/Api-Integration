package com.saamuah.googleapi.services;


import com.saamuah.googleapi.util.GoogleApiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;

@Service
public class GoogleApiService {

    @Autowired
    private GoogleApiUtil googleApiUtil;
    public Map<Object, Object> readDatFromGoogleSheet() throws GeneralSecurityException, IOException {
        return googleApiUtil.getDataFromGoogleSheet();
    }
}
