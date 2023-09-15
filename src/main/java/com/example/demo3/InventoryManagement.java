package com.example.demo3;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
    private List<InventoryItem> inventoryItems;

    public InventoryManagement() {
        inventoryItems = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventoryItems.add(item);
    }

    public void editItem(String itemName, int newQuantity) {
        for (InventoryItem item : inventoryItems) {
            if (item.getItemName().equals(itemName)) {
                item.setQuantity(newQuantity);
                return;
            }
        }
    }

    public void deleteItem(String itemName) {
        inventoryItems.removeIf(item -> item.getItemName().equals(itemName));
    }

    public List<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }
}
