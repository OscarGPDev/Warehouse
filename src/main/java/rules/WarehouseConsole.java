/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rules;

import entities.Item;
import interfaces.IWarehouseActions;

import java.util.ArrayList;

/**
 * @author acardia
 */
public class WarehouseConsole implements IWarehouseActions {
    ArrayList<Item> items;

    @Override
    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public Item createItem(Item item) throws Exception {
        if (item.getId() <= 0) {
            item.setId(this.generateProductId());
        }
        this.items.add(item);
        return item;
    }

    @Override
    public void deleteItem(int itemId) throws Exception {
        if (!this.items.removeIf(i -> i.getId() == itemId)) {
            throw new Exception("No se ha encontrado un item");
        }
    }

    @Override
    public void updateItem(Item item) throws Exception {
        if (item.getId() <= 0) {
            throw new Exception("El item no tiene un id valido");
        }
        if (this.items.stream().noneMatch(i -> i.getId() == item.getId())) {
            throw new Exception("El id del item no esta registrado, tal vez se haya eliminado antes.");
        }
        this.items.stream()
            .filter(i -> i.getId() == item.getId())
            .forEach(i -> i = item);
    }

    /**
     * @return an integer that it's the following id of the items collection
     */
    private int generateProductId() {
        return this.items.get(this.items.size() - 1).getId() + 1;
    }
}
