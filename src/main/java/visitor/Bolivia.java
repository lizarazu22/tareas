package visitor;

public class Bolivia implements IPaises{
    private double amount;

    public Bolivia(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void change(IVisitor visitor) {
        visitor.changeBolivia(this);
    }
}
