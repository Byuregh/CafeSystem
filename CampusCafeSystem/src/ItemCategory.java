public enum ItemCategory {
    DRINKS("Drinks", 5),
    SNACKS("Stacks", 16),
    MEALS("Meals", 8);
    String typeDescription;
    double priceProduct;

    ItemCategory(String typeDescription, double priceProduct) {
        this.typeDescription = typeDescription;
        this.priceProduct = priceProduct;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

}