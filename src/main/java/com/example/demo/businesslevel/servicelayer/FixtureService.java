package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.FixturePerson;

import java.util.List;

public interface FixtureService {

	void createGraph(String dirPath, List<FixturePerson> list);

}
