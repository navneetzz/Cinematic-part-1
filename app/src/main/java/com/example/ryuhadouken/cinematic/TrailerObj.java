package com.example.ryuhadouken.cinematic;

import java.io.Serializable;

/**
 * Created by ryuhadouken on 30/4/16.
 */
public class TrailerObj implements Serializable {

    String trName;
    String trId;

    public TrailerObj(String name, String source) {
        this.trName = name;
        this.trId = source;
    }

    public String getTrName() {
        return trName;
    }

    public String getTrId() {
        return trName;
    }

    public void setTrName(String name) {
        this.trName = name;
    }

    public void setTrId(String id) {
        this.trId = id;
    }
}
