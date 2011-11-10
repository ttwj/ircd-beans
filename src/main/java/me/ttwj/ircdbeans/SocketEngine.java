package me.ttwj.ircdbeans;

import java.io.*;
import java.net.*;
import net.sf.json.JSONObject;

public class SocketEngine implements Runnable {
    private String name;
    private String SID;
    private int port;
    private String description;
    private String networkName;
    private String networkDescription;
    public void loadConfig(JSONObject config) {
        
    }
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}