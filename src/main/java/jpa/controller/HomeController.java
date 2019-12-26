package jpa.controller;

import jpa.model.BlogModel;
import jpa.serviceLayer.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ServiceInterface blogService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getMyHomePage()
    {
        ModelAndView modelAndView = new ModelAndView();
        List<BlogModel> resultList= blogService.getAllBlog();
        modelAndView.addObject("result",resultList);
        modelAndView.addObject("BlogData",resultList);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
