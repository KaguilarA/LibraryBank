package Classes;

/**
 *
 * @author kevin
 */
public class Money {
    protected String name, prefix, sufix;
    protected int id;
    protected float exchange;

    public Money() {
    }

    public Money(String name, String prefix, String sufix, int id, float exchange) {
        this.name = name;
        this.prefix = prefix;
        this.sufix = sufix;
        this.id = id;
        this.exchange = exchange;
    }
    
    // Getter

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSufix() {
        return sufix;
    }

    public int getId() {
        return id;
    }

    public float getExchange() {
        return exchange;
    }
    
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSufix(String sufix) {
        this.sufix = sufix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExchange(float exchange) {
        this.exchange = exchange;
    }
    
    // ToString

    @Override
    public String toString() {
        return "{" + "name: " + getName() + ", prefix: " + getPrefix() + 
                ", sufix: " + getSufix() + ", id: " + getId() + ", exchange: " 
                + getExchange() + '}';
    }
}
