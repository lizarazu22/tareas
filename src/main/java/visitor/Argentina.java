package visitor;

public class Argentina implements IPaises{
    private double amount;

    public Argentina(){}

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void change(IVisitor visitor) {
        visitor.changeArgentina(this);
    }
}
