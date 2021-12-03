package com.example.demo.uilevel.controllerlayer;

import com.example.demo.businesslevel.domainlayer.FixturePerson;
import com.example.demo.businesslevel.servicelayer.FixtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/fix")
public class FixtureController {

    @Autowired
    private FixtureService fixtureService;

    String dirPath = System.getProperty("user.dir").replace('\\', '/') + "/src/main/resources/static/";

    public List<FixturePerson> list;

    @GetMapping("/createGraph")
    public void createGraph(){
        fixtureService.createGraph(dirPath, list);
    }

}

