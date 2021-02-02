package com.github.bluemustard2;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public class LotteryResults {

    private final String url;

    public LotteryResults(String url) {
        this.url = url;
    }

    public String getResults(){
        try {
            JSONObject latest = Unirest.get(url).asJson().getBody().getArray().getJSONObject(0);
            return latest.getString("winning_numbers");
        } catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return getResults();
    }
}
