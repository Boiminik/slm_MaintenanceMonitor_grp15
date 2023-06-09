package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    String ogMessage = "Everything operates as expected"; // Default message
    String currentMessage = ogMessage; //current chosen message

    @RequestMapping("/api/message")
    public String showMessage(){
        return currentMessage; //returns the current message of the string currentMessage
    }

    @RequestMapping("/api/message/set")
    public String setMessage(@RequestParam String customMessage){
        currentMessage = customMessage; //changes currentMessage to the desired message
        return "ok";
    }
    @RequestMapping("/api/message/reset")
    public String resetMessage(){
        currentMessage = ogMessage; //resets any set custom message to the default message; does nothing if already default
        return "ok";
    }


}
