package com.ace.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;

@ConfigurationProperties(prefix = "yml-properties")
public class YmlProperties {
    private String stringKey;
    private Integer integerKey;
    private String[] arrayKey;

    public String getStringKey() {
        return stringKey;
    }

    public void setStringKey(String stringKey) {
        this.stringKey = stringKey;
    }

    public Integer getIntegerKey() {
        return integerKey;
    }

    public void setIntegerKey(Integer integerKey) {
        this.integerKey = integerKey;
    }

    public String[] getArrayKey() {
        return arrayKey;
    }

    public void setArrayKey(String[] arrayKey) {
        this.arrayKey = arrayKey;
    }

    @Override
    public String toString() {
        return "YmlProperties{" +
                "stringKey='" + stringKey + '\'' +
                ", integerKey=" + integerKey +
                ", arrayKey=" + Arrays.toString(arrayKey) +
                '}';
    }
}
