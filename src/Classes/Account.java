package Classes;

/**
 *
 * @author kevin
 */
public class Account 
{
    protected User owner = new User();
    protected Money typeOfCurrency = new Money();
    protected float balance;
    protected int accountNumber;

    public Account() 
    {
    }

    public Account(float pbalance, int paccountnumber, User powner, 
            Money pcurrency) 
    {
        this.owner = powner;
        this.typeOfCurrency = pcurrency;
        this.balance = pbalance;
        this.accountNumber = paccountnumber;
    }

    //- Gets
    public User getOwner() 
    {
        return owner;
    }
    public Money getTypeOfCurrency() 
    {
        return typeOfCurrency;
    }
    public float getBalance() 
    {
        return balance;
    }
    public int getAccountNumber() 
    {
        return accountNumber;
    }

    //- Sets
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public void setTypeOfCurrency(Money typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //- To String
    @Override
    public String toString() {
        return "Nombre del cliente = " + owner + ", Moneda = " + typeOfCurrency 
                + ", Saldo = " + balance + 
                ", Numero de cuenta = " + accountNumber;
    }
}
