package Classes;

import java.util.ArrayList;

/**
 *
 * @author Kevin Aguilar
 */
public class Account 
{
    protected int ownerId, currencyId, accountNumber;
    protected float balance;
    protected ArrayList<Integer> transferHistory  = new ArrayList<>();

    public Account() 
    {
    }

    public Account(int ownerId, int currencyId, int accountNumber, float balance) {
        this.ownerId = ownerId;
        this.currencyId = currencyId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Getters

    public int getOwnerId() {
        return ownerId;
    }
    public int getCurrencyId() {
        return currencyId;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public float getBalance() {
        return balance;
    }
    public ArrayList<Integer> getTransferHistory() {
        return transferHistory;
    }
    
    // Setter

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setTransferHistory(ArrayList<Integer> transferHistory) {
        this.transferHistory = transferHistory;
    }
    
    // ToString

    @Override
    public String toString() {
        return "{" + "ownerId: " + getOwnerId() + ", currencyId: " + 
                getCurrencyId() + ", accountNumber: " + getAccountNumber() + 
                ", balance: " + getBalance() + ", transferHistory: " + 
                getTransferHistory() + '}';
    }
    
    // Methods
    
    public void addTransferHistory(int transferId) {
        this.transferHistory.add(transferId);
    }
}