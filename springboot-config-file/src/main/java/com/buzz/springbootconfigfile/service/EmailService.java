package com.buzz.springbootconfigfile.service;

public interface EmailService {

    boolean send(String to,String title,String content);
}
