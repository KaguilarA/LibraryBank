package Classes;

/**
 *
 * @author kevin
 */

import java.util.Date;

public class Transfer {
    protected int type;
    protected float amount;
    protected Date transferDay = new Date();
    protected Account transmitter = new Account();
    protected FavoritesAcounts receiver = new FavoritesAcounts();
    protected Money typeOfMoney = new Money();

    public Transfer(int ptype, float pamount, Date ptransferdate, 
            Account ptransmitter, FavoritesAcounts preceiver, Money ptypeofmoney)
    {
        this.type = ptype;
        this.amount = pamount;
        this.transferDay = ptransferdate;
        this.transmitter = ptransmitter;
        this.receiver = preceiver;
        this.typeOfMoney = ptypeofmoney;
    }

    //- Gets
    public int getType() {
        return type;
    }
    public float getAmount() {
        return amount;
    }
    public Date getTransferDay() {
        return transferDay;
    }
    public Account getTransmitter() {
        return transmitter;
    }
    public FavoritesAcounts getReceiver() {
        return receiver;
    }
    public Money getTypeOfMoney() {
        return typeOfMoney;
    }

    //- Sets
    public void setType(int type) {
        this.type = type;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void setTransferDay(Date transferDay) {
        this.transferDay = transferDay;
    }
    public void setTransmitter(Account transmitter) {
        this.transmitter = transmitter;
    }
    public void setReceiver(FavoritesAcounts receiver) {
        this.receiver = receiver;
    }
    public void setTypeOfMoney(Money typeOfMoney) {
        this.typeOfMoney = typeOfMoney;
    }

    //- To String
    @Override
    public String toString() {
        return "Tipo de transferencia = " + type + ", Monto = " + amount + 
                ", Fecha = " + transferDay + 
                ", Emisor = " + transmitter.getAccountNumber() + 
                ", Receptor = " + receiver.toString() + 
                ", Moneda = " + typeOfMoney.getMoneyName();
    }
    
}
