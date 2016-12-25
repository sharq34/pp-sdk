package com.yeepay.payplus.core.entity;

import com.yeepay.payplus.util.PayplusUtil;
import org.apache.log4j.Logger;


/**
 * Created by Marco on 15/12/2016.
 */
public class Trophy {

    private static final String SUCCESS = "SUCCESS";
    private static final String FAILURE = "FAILURE";
    private Logger logger = Logger.getLogger(Trophy.class);
    private int state; //0-fail, 1-success
    private String requestNo;
    private String activeNo; //for 3.2.1 sendRedPacket
    private String response;
    private String keyInfo;

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getActiveNo() {
        return activeNo;
    }

    public void setActiveNo(String activeNo) {
        this.activeNo = activeNo;
    }

    public String getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(String keyInfo) {
        this.keyInfo = keyInfo;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return response;
    }

    private String format() {
        StringBuilder formattedResult = new StringBuilder();

        formattedResult.append(response);

        if (!PayplusUtil.isNull(requestNo))
            formattedResult.insert(0, "requestNo: " + requestNo + "\n");

        if (!PayplusUtil.isNull(activeNo))
            formattedResult.insert(0, "activeNo: " + activeNo + "\n");

        return formattedResult.toString();
    }

    public void print() {
        logger.info("[Reponse of Payplus]\n" + format());
    }

    public void genQRCodeImage(String path){
        PayplusUtil.genQRCodeImage(this, path);
    }
}
