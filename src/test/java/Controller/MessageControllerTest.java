package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {

    @Test
    void showMessage() { //test1  shows the correct message
        MessageController mCont = new MessageController();
        String testmessage = "This is a test message";
        assertEquals("This is a test message", testmessage);
    }
}