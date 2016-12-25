package com.yeepay.payplus.bo;

/**
 * Created by Marco on 21/12/2016.
 */
public class TransferReq extends BaseBO {

    public static final String USER_TO_USER = "USER_TO_USER";
    public static final String CARD_TO_USER = "CARD_TO_USER";

    private String transferType;
    private String amount;
    private String fromUserNo;
    private String toUserNo;
    private String token;
    /**
     * required as transferType equals "CARD_TO_USER"
     */
    private String bindCardId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFromUserNo() {
        return fromUserNo;
    }

    public void setFromUserNo(String fromUserNo) {
        this.fromUserNo = fromUserNo;
    }

    public String getToUserNo() {
        return toUserNo;
    }

    public void setToUserNo(String toUserNo) {
        this.toUserNo = toUserNo;
    }

    public String getBindCardId() {
        return bindCardId;
    }

    public void setBindCardId(String bindCardId) {
        this.bindCardId = bindCardId;
    }
}
