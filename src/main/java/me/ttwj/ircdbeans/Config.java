package me.ttwj.ircdbeans;

import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.io.IOUtils;

public class Config {
    public JSONObject json;
    public JSONObject serverInfo;
    public JSONObject connectClasses;
    public JSONObject listen;
    public void load(String config) throws Exception {
        InputStream is = Config.class.getResourceAsStream(config);
        String jsonTxt = IOUtils.toString(is);
        json = (JSONObject) JSONSerializer.toJSON(jsonTxt);
        
        serverInfo = json.getJSONObject("serverinfo");
        connectClasses = json.getJSONObject("class");
        listen = json.getJSONObject("listen");
    }
}
