package com.trivadis.spring.user.controller;

import com.trivadis.spring.user.domain.User;
import org.apache.commons.compress.utils.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.ByteArrayInputStream;
import java.io.IOException;

//@Component
//@Controller // + http
@RestController // + http nur JSON
public class HelloWorldController {

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String helloName(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello/{name}")
    public String helloPath(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/helloUser/{name}")
    public User helloUser(@PathVariable("name") String name) {
        return new User(name, name);
    }

    @PostMapping("/echoUser")
    public User helloUser(@RequestBody @Valid User user) {
        return user;
    }








    @GetMapping("/download")
    public void download(@RequestParam("user") String user, HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=user.xlsx");
        ByteArrayInputStream stream = ExcelFileExporter.getData(user);
        IOUtils.copy(stream, response.getOutputStream());
    }

}
