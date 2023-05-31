package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageControllerTest {

    @Test
    void showMessage() { //test1  shows the correct message gets returned
        MessageController mCont = new MessageController();
        String testmessage = "This is a test message";
        mCont.setMessage(testmessage);
        assertEquals(testmessage,mCont.showMessage());
    }
    @Test
    void setMessage(){ //test2 shows that the message was correctly changed into the desired text
        MessageController mCont = new MessageController();
        String test = "Hope this works";
        mCont.setMessage(test);
        assertEquals(test, mCont.currentMessage);
    }
    @Test
    void resetMessage(){//test3 resets any custom message to the default message successfully
        MessageController mCont = new MessageController();
        String test = "Test Message, DO NOT DELETE";
        mCont.setMessage(test);
        mCont.resetMessage();
        assertEquals(mCont.ogMessage, mCont.currentMessage);
    }
}