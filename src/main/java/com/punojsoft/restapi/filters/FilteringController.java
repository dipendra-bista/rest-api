package com.punojsoft.restapi.filters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
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

    @GetMapping("/anygetter")
    public void extendableBean() throws JsonProcessingException {
        ExtendableBean bean = new ExtendableBean("Extendable Bean");
        bean.add("field1", "value1");
        bean.add("field2", "value2");
        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println("result : " + result);
    }

    @GetMapping("/jsonroot")
    public void jsonroot() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        SomeBean bean = new SomeBean();
        bean.setName("dipendra bista");
        bean.setPhone("9814320455");
        bean.setSalary("5000");
        String result = mapper.writeValueAsString(bean);
        
        System.out.println("result : " + result);
    }
}
