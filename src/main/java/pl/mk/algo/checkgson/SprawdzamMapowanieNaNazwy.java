package pl.mk.algo.checkgson;

import com.google.gson.annotations.SerializedName;

public class SprawdzamMapowanieNaNazwy {

    @SerializedName(value = "emailId", alternate = "emailAddress")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
