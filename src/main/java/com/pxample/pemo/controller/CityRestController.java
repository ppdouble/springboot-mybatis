package com.pxample.pemo.controller;

import com.pxample.pemo.mapper.CityMapper;
import com.pxample.pemo.pojo.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cities")
@RestController
public class CityRestController {

    private final CityMapper cityMapper;

    public CityRestController(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @GetMapping("{state}")
    City getCity(@PathVariable String state) {
        return cityMapper.findByState(state);
    }

}