package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MessageController {


    String ogMessage = "Everything operates as expected"; // Default message
    String currentMessage = ogMessage;

    @RequestMapping("/api/message")
    public String showMessage(){
        return ogMessage; //returns the current message of the string ogMessage
    }

    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String customMessage){
        currentMessage = customMessage;
        return "ok";
    }


}
