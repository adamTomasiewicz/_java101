package pl.akademiakodu.classes_And_Objects;

public class Category {

    private Integer categoryIdName;
    private String categoryName;

    public Category(Integer categoryIdName, String categoryName) {
        this.categoryIdName = categoryIdName;
        this.categoryName = categoryName;
    }

    public Integer getCategoryIdName() {
        return categoryIdName;
    }

    public void setCategoryIdName(Integer categoryIdName) {
        this.categoryIdName = categoryIdName;

    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryIdName=" + categoryIdName +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}

