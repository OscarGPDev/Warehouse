/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.Item;

import java.util.ArrayList;

/**
 * @author acardia
 */
public interface IWarehouseActions {
    /**
     * @return a readonly arraylist that contains all the items on the warehouse
     * @throws Exception if fails at getting the warehouse items
     */
    ArrayList<Item> getItems() throws Exception;

    /**
     * @param item to add to the warehouse
     * @throws Exception if fails to create the item
     */
    Item createItem(Item item) throws Exception;

    /**
     * @param itemId product's ID that is desired to delete
     * @throws Exception if fails to delete the item;
     */
    void deleteItem(int itemId) throws Exception;

    /**
     * @param item to update
     * @throws Exception if fails at updating the item
     */
    void updateItem(Item item) throws Exception;
}
