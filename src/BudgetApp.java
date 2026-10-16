import java.util.ArrayList;
import java.util.Collections;
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
            
            // add category to categories ArrayList
            categories.add(idx, category);
            
            // print individual categories
            System.out.println(categories.get(idx));
            
            // increase idx each iteration
            idx++;
        }
        
        // sort the categories ArrayList in reverse order
        Collections.sort(categories, Collections.reverseOrder());
        
        // print categories
        System.out.println(categories);
        
        // print the sum of each budget difference for each category
        System.out.println(budgetDifference(categories));
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
        int sum = 0;

        for (BudgetCategory category : categories) {
            sum += category.getlimit() - category.getSpending();
        }

        return sum;
    }
}
