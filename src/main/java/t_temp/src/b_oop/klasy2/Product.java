package pl.akademiakodu.classes_And_Objects;

public class Product {

    private Integer productIdNumber;
    private String productIdName;

    public Product(Integer productIdNumber, String productIdName) {
        this.productIdNumber = productIdNumber;
        this.productIdName = productIdName;
    }

    public Integer getProductIdNumber() {
        return productIdNumber;
    }

    public void setProductIdNumber(Integer productIdNumber) {
        this.productIdNumber = productIdNumber;
    }

    public String getProductIdName() {
        return productIdName;
    }

    public void setProductIdName(String productIdName) {
        this.productIdName = productIdName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productIdNumber=" + productIdNumber +
                ", productIdName='" + productIdName + '\'' +
                '}'+" is in category "+ category;
    }

    private Category category;

    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category = category;
    }


    public static void main(String[] args) {

        Product product1 = new Product(1, "Super pralka");
        Product product2 = new Product(2, "Suszarka");
        Product product3 = new Product(3, "Super komputer");
        System.out.println(product3);
        Category category1 = new Category(1, "AGD");
        Category category2 = new Category(2, "Komputery");
        System.out.println(category2);

       product1.setCategory(category1);
        System.out.println(product1);
        System.out.println();



    }
}

