import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetApp {
    public static void main(String[] args) {
        // BudgetCategory groceries = new BudgetCategory("Groceries", 100, 50);
        // System.out.println(groceries);

        Scanner scanner = new Scanner(System.in);

        List<BudgetCategory> categories = new ArrayList<>();
        int idx = 0;
        
        while (scanner.hasNextLine()) {
            String categoryStr = scanner.nextLine();
            double limit = scanner.nextDouble();
            double spent = scanner.nextDouble();
            BudgetCategory category = new BudgetCategory(categoryStr, limit, spent);

            if (scanner.hasNextLine()) scanner.nextLine();

            categories.add(idx, category);
        }

        System.out.println(categories);

    }

    /**
     * Returns overall how much over/under budget a person is given a list of their
     * categories.
     * 
     * This should be the sum of how much over/under budget each individual category is.
     * 
     * If the person is under budget, the result will be negative. If they are over budget, the
     * result will be positive.
     * 
     * @param categories the budget categories with the spend
     * @return the total amount over/under budget
     */
    public static int budgetDifference(List<BudgetCategory> categories) {
        // TODO: You will implement this method in Wave 4
        // Note that this method SHOULD NOT have a print statement.
        // It should instead return the value.
        return -1;
    }
}
