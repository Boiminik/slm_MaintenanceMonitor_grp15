package Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MessageController {

    String ogMessage = "Everything operates as expected"; // Default message

    @RequestMapping("/api/message")
    public String showMessage(){
        return ogMessage; //returns the current message of the string ogMessage
    }


}
