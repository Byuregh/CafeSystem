public class Item {
    private final int itemId;
    protected  String itemName;
    private final ItemCategory itemCategory;
    private static int generateItemId = 0;

    public Item(ItemCategory itemCategory) {
        this.itemId = generateItemId++;
        this.itemCategory = itemCategory;
    }

//    public double getPrice(){
//        return this.itemCategory.price;
//    }
    public String getName(){
        return itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemCategory=" + itemCategory +
                '}';
    }

    @Override
    public int hashCode() {
        return itemId;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Item)
            return this.itemId == ((Item) obj).itemId;

        return false;
    }

//    @Override
//    public int compareTo(Item o) {
//        return (int)(this.getPrice() - o.getPrice());
//    }
}
