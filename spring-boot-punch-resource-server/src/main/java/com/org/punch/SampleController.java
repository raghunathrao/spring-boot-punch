package com.org.punch;


import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@Timed
public class SampleController {
    Map<Integer, String> people = new HashMap<Integer, String>();


    public SampleController(MeterRegistry registry) {
        people.put(1,"Harish");
        people.put(2,"Sachine");
        people.put(3,"Santosh");

        // constructs a gauge to monitor the size of the population
//        registry.mapSize(people,"population");
        registry.gaugeMapSize("population",null,people);
    }

    @GetMapping("/api/people")
    public Collection<String> listPeople() {
        return  people.values();
    }

    @GetMapping("/api/person/{id}")
    public String findPerson(@PathVariable Integer id) {
        return people.get(id);
    }
}
