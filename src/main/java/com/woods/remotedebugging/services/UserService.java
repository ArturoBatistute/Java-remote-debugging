package com.woods.remotedebugging.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${clients.user-analyzer}")
    private String userAnalyzerClient;

    public String analyzeInformation(){

        if (userAnalyzerClient.isEmpty())
            throw new RuntimeException();

        // Business logic...

        return "User analysis successfully done!";
    }
}
