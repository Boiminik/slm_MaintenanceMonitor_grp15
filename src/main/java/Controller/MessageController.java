package Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MessageController {
    String ogMessage = "Everything operates as expected";

    @RequestMapping("/api/message")
    public String showMessage(){
        return ogMessage;
    }


}
