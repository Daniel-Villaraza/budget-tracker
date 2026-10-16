public class BudgetCategory {
    private String category;
    private double limit;
    private double spending;

    public BudgetCategory(String category, double limit, double spending) {
        this.category = category;
        this.limit = limit;
        this.spending = spending;
    }

    public String getCategory() {
        return category;
    }

    public double getlimit() {
        return limit;
    }

    public double getSpending() {
        return spending;
    }

    public String toString() {
        return category.toUpperCase() + "\nlimit: " + getlimit() + "\nSpending: " + getSpending();
    }
}