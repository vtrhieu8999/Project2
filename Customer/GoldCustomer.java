package model.Customer;

public class GoldCustomer extends SilverCustomer {
    public GoldCustomer(){}
    public GoldCustomer(SilverCustomer instance){
        super(instance);
    }
    @Override
    public String toString(){
        return "GoldCustomer/"+this.id;
    }
}
