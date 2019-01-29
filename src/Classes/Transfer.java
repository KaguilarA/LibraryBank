package Classes;

/**
 *
 * @author kevin
 */

import java.util.Date;

public class Transfer {
    protected int type, transferId, accountIdFrom, accountIdTo;
    protected float amount;
    protected Date transferDay = new Date();

    public Transfer() {
    }

    public Transfer(int type, int transferId, int accountIdFrom, int accountIdTo, float amount) {
        this.type = type;
        this.transferId = transferId;
        this.accountIdFrom = accountIdFrom;
        this.accountIdTo = accountIdTo;
        this.amount = amount;
    }
    
    // Getters

    public int getType() {
        return type;
    }

    public int getTransferId() {
        return transferId;
    }

    public int getAccountIdFrom() {
        return accountIdFrom;
    }

    public int getAccountIdTo() {
        return accountIdTo;
    }

    public float getAmount() {
        return amount;
    }

    public Date getTransferDay() {
        return transferDay;
    }
    
    // Setters

    public void setType(int type) {
        this.type = type;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public void setAccountIdFrom(int accountIdFrom) {
        this.accountIdFrom = accountIdFrom;
    }

    public void setAccountIdTo(int accountIdTo) {
        this.accountIdTo = accountIdTo;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setTransferDay(Date transferDay) {
        this.transferDay = transferDay;
    }
    
    // ToString

    @Override
    public String toString() {
        return "{" + "type: " + getType() + ", transferId: " + getTransferId() +
                ", accountIdFrom: " + getAccountIdFrom() + ", accountIdTo: " + 
                accountIdTo + ", amount: " + getAccountIdTo() + 
                ", transferDay: " + getTransferDay() + '}';
    }
}
