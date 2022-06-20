package visitor;

public class Italia implements IPaises{
    private double amount;

    public Italia(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void change(IVisitor visitor) {
        visitor.changeItalia(this);
    }
}
