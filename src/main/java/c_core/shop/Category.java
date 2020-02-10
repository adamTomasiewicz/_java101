package c_core.shop;

public class Category {
    static int counter;
    private int categoryID;
    private String categoryName;

    public Category(String categoryName) {
        this.categoryID = counter++;
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    @Override
    public String toString() {
        return "Kategoria: " + categoryName;
    }
}
