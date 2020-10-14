package model.Customer;

public class SilverCustomer extends BasicCustomer {
    private long balance;

    //blank constructor
    public SilverCustomer(){ super(); }
    //full constructor
    public SilverCustomer(String userName, String password, long balance,
                          long id, String email, String name){
        super(id, userName, email, name, password);
        this.balance= balance;
    }
    //complete casting up
    public SilverCustomer(BasicCustomer instance, long balance){
        super(instance);
        this.balance= balance;
    }
    //partial casting up
    public SilverCustomer(BasicCustomer instance){
        super(instance);
    }
    //casting down
    public <T extends SilverCustomer> SilverCustomer(T instance){
        super(instance);
        this.balance= instance.getBalance();
    }
    public long getBalance() {
        return balance;
    }
    @Override
    public String toString(){
        return "SilverCustomer/"+this.id;
    }
}
