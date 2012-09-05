package com.foogaro.resteasy.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author l.fugaro@gmail.com
 */

@XmlRootElement(name = "result")
public class Result implements Serializable {

    private DataWrapper data;
    private String code;
    private String message;

    @XmlElement(name = "data")
    public DataWrapper getData() {
        return data;
    }

    public void setData(DataWrapper data) {
        this.data = data;
    }

    @XmlElement(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @XmlElement(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
