package com.punojsoft.restapi.filters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filters")
public class FilteringController {
    @GetMapping
    public SomeBean someBean() {
        return new SomeBean("dipendra bista", "9814320455", "50000");
    }
}
