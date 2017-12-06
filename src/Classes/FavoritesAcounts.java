package Classes;

/**
 *
 * @author kevin
 */
public class FavoritesAcounts {
    protected Account numberAccount = new Account();
    protected User userid = new User();

    public FavoritesAcounts() 
    {
    }
    
    public FavoritesAcounts(Account pnumberaccount, User puserid) 
    {
        this.numberAccount = pnumberaccount;
        this.userid = puserid;
    }

    //- Gets
    public Account getNumberAccount() {
        return numberAccount;
    }
    public User getUserid() {
        return userid;
    }

    //- Sets
    public void setNumberAccount(Account numberAccount) {
        this.numberAccount = numberAccount;
    }
    public void setUserid(User userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Numero de cuenta = " + numberAccount.getAccountNumber() + 
                ", Usuario = " + userid.getName();
    }
    
}
