package com.apicreation.employeeInfo.controllers;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Hashtable;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class DefaultController {

    @Autowired
    BuildProperties buildProperties;

    @GetMapping("/info")
    public ResponseEntity<?> getInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
            .withLocale(Locale.US)
            .withZone(ZoneId.systemDefault());

        Hashtable<String, String> result = new Hashtable<String, String>();
        result.put("Last Build", formatter.format(buildProperties.getTime()));

        return ResponseEntity.ok("");
    }
}