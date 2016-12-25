package com.yeepay.payplus.bo;

/**
 * Created by Marco on 16/12/2016.
 */
public class SendRedPacketReq extends BaseBO{

    private String activeNo;

    public SendRedPacketReq(String merchantNo, String merchantUserId, String activeNo) {
        super.setMerchantNo(merchantNo);
        super.setMerchantUserId(merchantUserId);
        this.activeNo = activeNo;
    }

    public String getActiveNo() {
        return activeNo;
    }

    public void setActiveNo(String activeNo) {
        this.activeNo = activeNo;
    }
}
