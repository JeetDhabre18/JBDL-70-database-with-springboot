package com.gfg.JBDL70databasewithspringboot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller// whenever we want to communicate bwt client and server it is
// standard that server search for controller bean

//@ResponseBody // here string is not understable by tomcat so responsebody convert into a readable format or into a byte

//1 browser 2 postman 3 the terminal
@RestController //combination of controller and response body

//scan base packages is creating bucket or spring boot itself

@RequestMapping("/v1")
public class Controllerdemo {
    // for getting log
    private static final Log logger = LogFactory.getLog(Controllerdemo.class);
    // for getting data from the server
    @GetMapping("/demo")
    public  String getDemo() {
        logger.debug("warn logs");
        return "Demo";
    }

    //for posting something into server
    @PostMapping("/post/demo")
    public String postDemo() {
        return "Post Demo";
    }

    // for updating data into server
    @PutMapping("/update/demo")
    public  String updateDemo() {
        return "Update Demo";
    }

}
