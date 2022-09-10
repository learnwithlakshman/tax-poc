package com.lwl.taxpoc.entity;


import java.io.Serializable;

/**
 * See: https://stackoverflow.com/questions/48784923/is-using-id-field-in-allargsconstructor-while-using-spring-jpa-correct
 * @author developer
 */

public abstract class BaseEntity implements Serializable {
    private Long id;
}