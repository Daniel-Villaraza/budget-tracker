public class BudgetCategory {
    private String category;
    private double budget;
    private double spending;

    public BudgetCategory(String category, double budget, double spending) {
        this.category = category;
        this.budget = budget;
        this.spending = spending;
    }

    public String getCategory() {
        return category;
    }

    public double getBudget() {
        return budget;
    }

    public double getSpending() {
        return spending;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setSpending(double spending) {
        this.spending = spending;
    }

    public String toString() {
        return category.toUpperCase() + "\nBudget: " + budget + "\nSpending: " + spending;
    }
}