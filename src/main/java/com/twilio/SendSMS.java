package com.twilio;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message; 
import com.twilio.rest.api.v2010.account.MessageCreator; 
import com.twilio.type.PhoneNumber; 

import java.math.BigDecimal; 
import java.net.URI; 
import java.util.ArrayList; 
import java.util.List; 
 
public class SendSMS { 
    private final static String ACCOUNT_SID = "AC7b09adbd4421e9a7778d35e19f865e6b"; 
    private final static String AUTH_TOKEN = "a35abb12e307a0b95f72b4968f86c6f1"; 
 
    public static void main(String[] args) { 
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
         
        Message message = Message.creator( 
            new PhoneNumber("+13472105431"), // to
            new PhoneNumber("+12018175267"), // from
            "Hello from gradle pj." // body
        ).create(); 
    
        System.out.println(message.getSid()); 
    } 
}
