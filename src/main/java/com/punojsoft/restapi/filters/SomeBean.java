package com.punojsoft.restapi.filters;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @JsonPropertyOrder aloows to specify the order
 * <p>
 * when serializing
 */
@JsonPropertyOrder({"name", "salary", "phome"})
@JsonRootName(value = "user")

/**
 * excluding null ,empty,default,abscent and custom calues while serializing
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonInclude(JsonInclude.Include.ALWAYS)
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
//@JsonInclude(JsonInclude.Include.NON_ABSENT)
//@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
public class SomeBean {
    private String name;
    private String phone;
    //JsonIgnore indicates that the annotated method or field is to be ignored
    @JsonIgnore
    private String salary;

    public SomeBean() {
    }

    //generating constructor
    public SomeBean(String name, String phone, String salary) {
        super();
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}