package com.github.rshtishi.junit5.basic;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MailServerTest {

    private static MailServer mailServer;
    private static String testEmail;
    private static String testSubject;
    private static String testBody;
    private static String testTo;
    private static List<String> sentEmails;

    @BeforeAll
    static void beforeAll() {
        mailServer = new MailServer();
        testEmail = "test@example.com";
        testSubject = "Test Subject";
        testBody = "Test Body";
        testTo = "test_to@example.com";
        sentEmails = new ArrayList<>();
    }

    @BeforeEach
    void setUp() {
        sentEmails.add(testSubject + ": " + testBody);
        mailServer.sendEmail(testTo, testSubject, testBody);
    }

    @Test
    void shouldSendEmail() {
        List<String> receivedEmails = mailServer.getEmails(testTo);
        assertEquals(sentEmails, receivedEmails);
    }

    @Test
    void shouldHaveCorrectSubject() {
        List<String> receivedEmails = mailServer.getEmails(testTo);
        assertTrue(receivedEmails.get(0).startsWith(testSubject));
    }

    @Test
    void shouldHaveCorrectBody() {
        List<String> receivedEmails = mailServer.getEmails(testTo);
        assertTrue(receivedEmails.get(0).endsWith(testBody));
    }

    @AfterEach
    void tearDown() {
        mailServer.getEmails(testTo).clear();
    }

    @AfterAll
    static void afterAll() {
        mailServer = null;
    }
}


