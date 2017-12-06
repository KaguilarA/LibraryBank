package Classes;

/**
 *
 * @author kevin
 */
public class Money {
    protected String moneyName;
    protected int moneyId;
    protected float exchange;

    public Money() {
    }

    public Money(String moneyName, int moneyId, float exchange) {
        this.moneyName = moneyName;
        this.moneyId = moneyId;
        this.exchange = exchange;
    }

    //- Gets
    public String getMoneyName() {
        return moneyName;
    }
    public int getMoneyId() {
        return moneyId;
    }
    public float getExchange() {
        return exchange;
    }

    //- Sets
    public void setMoneyName(String moneyName) {
        this.moneyName = moneyName;
    }
    public void setMoneyId(int moneyId) {
        this.moneyId = moneyId;
    }
    public void setExchange(float exchange) {
        this.exchange = exchange;
    }

    //- to String
    @Override
    public String toString() {
        return "Moneda = " + moneyName + ", Identificador = " + moneyId +
                ", Tipo de cambio = " + exchange;
    }
    
}
