package com.tech.oreder.rest;

import java.util.Date;
import java.util.List;

import com.tech.order.beans.UserOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/order")
public class OrderServiceRestController {

    @RequestMapping(value = "/health",method = RequestMethod.GET,produces = {MediaType.TEXT_HTML_VALUE})
    public  String healthCheck(){


        return  "service is running fine.....";

    }


}