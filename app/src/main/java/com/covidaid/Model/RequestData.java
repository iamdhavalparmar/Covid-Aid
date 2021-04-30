package com.covidaid.Model;

import java.io.Serializable;

public class RequestData implements Serializable {
    String need,age,description,quantity,blood_group,gender;

    public RequestData(String need, String age, String description, String quantity, String blood_group, String gender) {
        this.need = need;
        this.age = age;
        this.description = description;
        this.quantity = quantity;
        this.blood_group = blood_group;
        this.gender = gender;
    }

    public String getNeed() {
        return need;
    }

    public String getAge() {
        return age;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public String getGender() {
        return gender;
    }
}
