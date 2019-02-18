package com.kt_tips_java.kt_tips_java.web;
//Libraries
import K2Connect.K2Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KtTipsController {

    // Homepage
    @RequestMapping("/")
    public String index() {
        return "Homepage";
    }

    // For the Webhook
    @RequestMapping(value = "/parse", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> handleRequest(RequestEntity<String> requestEntity) {
        System.out.println("The Request Body :" + requestEntity.getBody());
        System.out.println("The Response Headers :" + requestEntity.getHeaders());
        K2Client k2Client;
        return new ResponseEntity<>("my response body", HttpStatus.OK);
    }
}
