package Game;

public enum ItemType {

    SMALL_POTION(0),
    BIG_POTION(1),
    CROSS_REBIRTH(2);
    int inventoryIndex;

    private ItemType(int inventoryIndex) {
        this.inventoryIndex = inventoryIndex;
    }

    public int getInventoryIndex() {
        return inventoryIndex;
    }

}
