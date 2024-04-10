package org.example.service;

import org.example.entity.User;

import java.time.LocalDateTime;

public interface UserService {

    User saveUser(User user, String url);

    void removeSessionMessage();
    void sendEmail(User user, String url);
    Boolean verifyAccount(String verificationCode);

    String sendEmail(User user);

    boolean hasExpired(LocalDateTime expiryDateTime);
}
