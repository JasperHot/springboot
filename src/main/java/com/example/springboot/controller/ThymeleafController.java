package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class ThymeleafController {
    @RequestMapping(value = "/hi/{params}",method = RequestMethod.GET)
    public String hello1(@PathVariable("params") String params, Locale locale, Model model) {
        model.addAttribute("greeting", params);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        return params;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello2(@RequestParam(value = "params", defaultValue = "hello") String params, Locale locale, Model model) {
        model.addAttribute("greeting", params);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        return params;
    }
}
