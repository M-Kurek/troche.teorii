package pl.mk.algo.checkgson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.hamcrest.core.StringContains;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * cut:
 *     @SerializedName(value = "emailId", alternate = "emailAddress")
 *     private String email;
 */
public class SprawdzamMapowanieNaNazwyTest {
    @Test
    public void whenALternateName_thenDeserialized() {
        //given
        String test = "jakis adresik";
        String json = "{emailAddress = '" + test + "'}";
        Gson gson = new GsonBuilder().create();
        //when
        SprawdzamMapowanieNaNazwy cut = gson.fromJson(json, SprawdzamMapowanieNaNazwy.class);
        //then
        assertEquals(test, cut.getEmail());
    }
    @Test
    public void whenSerializeName_thenDeserialized() {
        //given
        String test = "jakis adresik";
        String json = "{emailId = '" + test + "'}";
        Gson gson = new GsonBuilder().create();
        //when
        SprawdzamMapowanieNaNazwy cut = gson.fromJson(json, SprawdzamMapowanieNaNazwy.class);
        //then
        assertEquals(test, cut.getEmail());
    }
    @Test
    public void whenSerialized_thenAnnotadedNameUsed() {
        //given
        SprawdzamMapowanieNaNazwy cut = new SprawdzamMapowanieNaNazwy();
        String test = "jakis adresik";
        cut.setEmail(test);
        Gson gson = new GsonBuilder().create();
        //when
        String json = gson.toJson(cut);
        //then
        assertThat(json, StringContains.containsString("\"emailId\""));
    }

}