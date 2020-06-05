package com.abc.domain;

import java.io.Serializable;

/**
 * 地址实体类。
 */
public class Address implements Serializable {
    private String province;
    private String city;
    private Integer roadNum;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRoadNum() {
        return roadNum;
    }

    public void setRoadNum(Integer roadNum) {
        this.roadNum = roadNum;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", roadNum=" + roadNum +
                '}';
    }
}
