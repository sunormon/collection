package com.frame.collection.entity;

import lombok.Data;

import java.util.Date;
@Data
public class SysConfig {
    private String variable;
    private String value;
    private Date set_time;
    private String set_by;

//    public String getVariable() {
//        return variable;
//    }
//
//    public void setVariable(String variable) {
//        this.variable = variable;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public Date getSet_time() {
//        return set_time;
//    }
//
//    public void setSet_time(Date set_time) {
//        this.set_time = set_time;
//    }
//
//    public String getSet_by() {
//        return set_by;
//    }
//
//    public void setSet_by(String set_by) {
//        this.set_by = set_by;
//    }
//
//    @Override
//    public String toString() {
//        return "SysConfig{" +
//                "variable='" + variable + '\'' +
//                ", value='" + value + '\'' +
//                ", set_time=" + set_time +
//                ", set_by='" + set_by + '\'' +
//                '}';
//    }
}
