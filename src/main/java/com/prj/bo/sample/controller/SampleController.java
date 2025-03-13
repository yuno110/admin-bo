package com.prj.bo.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.prj.bo.sample.service.SampleService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("/sampleList")
    public ModelAndView sampleList() {
        List<Map<String, Object>> sampleList = sampleService.getSampleList();
        for (Map<String, Object> sample : sampleList) {
            System.out.println(sample);
        }
        return new ModelAndView();
    }

    @RequestMapping("/test")
    public void testProperty () {

    }
}
