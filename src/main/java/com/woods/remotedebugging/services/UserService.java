package com.woods.remotedebugging.services;

import com.woods.remotedebugging.entities.UserRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Value("${clients.user-analyzer}")
    private String userAnalyzerClient;

    public String analyzeInformation(UserRecord user){

        if (userAnalyzerClient.isEmpty())
            throw new RuntimeException();

        return "User analysis successfully done!";
    }
}
