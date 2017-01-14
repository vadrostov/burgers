package com.vadimrostov.controller;

import com.vadimrostov.domain.MenuItem;
import com.vadimrostov.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Алиса on 09.01.2017.
 */

@Controller
@RequestMapping(value = "/admin")
public class AdminController {


    ModelAndView modelAndView= new ModelAndView();

    @Autowired
    MenuService menuService;


@RequestMapping(method = RequestMethod.GET)
    public ModelAndView adminka(){
        modelAndView.addObject("menuitem", new MenuItem());
        modelAndView.setViewName("adminka");
        return modelAndView;
    }

    @RequestMapping (method = RequestMethod.POST)
    public ModelAndView saveadmin(MenuItem menuItem){
       menuService.save(menuItem);
        return modelAndView;
    }

}
