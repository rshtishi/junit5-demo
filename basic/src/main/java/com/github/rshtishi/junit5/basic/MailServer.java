package com.github.rshtishi.junit5.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailServer {

    private Map<String, List<String>> emails = new HashMap<>();

    public void sendEmail(String to, String subject, String body) {
        List<String> toEmails = emails.get(to);
        if (toEmails == null) {
            toEmails = new ArrayList<>();
            emails.put(to, toEmails);
        }
        toEmails.add(subject + ": " + body);
    }

    public List<String> getEmails(String to) {
        return emails.get(to);
    }
}