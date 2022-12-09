/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 * @author acardia
 */
public class Item {
    /**
     * Item's id
     */
    private int id;
    /**
     * Item's name
     */
    private String name;
    /**
     * Item's quantity
     */
    private double quantity;
    /**
     * Item's measurement unit
     */
    private MeasurementUnit measurementUnit;
    /**
     * Item's selling price
     */
    private double price;
    /**
     * Item's cost from provider
     */
    private double cost;

    /**
     * Creates an intem instance, if you use this constructor you then must use
     * the setters to provide the data
     */
    public Item() {

    }

    /**
     * Item constructor that requieres all the data from the beginning
     */
    public Item(
        int id,
        String name,
        double quantity,
        MeasurementUnit measurementUnit,
        double price,
        double cost) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.measurementUnit = measurementUnit;
        this.price = price;
        this.cost = cost;
    }
    /**
    * Item constructor that requieres all the data from the beginning, it doesn't uses an id,
    * use this if you pretend to add an item to a catalog and want to dinamically create that item.
    */
    public Item(
            String name,
            double quantity,
            MeasurementUnit measurementUnit,
            double price,
            double cost) {
        this.name = name;
        this.quantity = quantity;
        this.measurementUnit = measurementUnit;
        this.price = price;
        this.cost = cost;
    }

    /**
     * @return the measurement unit of this item
     */
    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * @param measurementUnit of the item
     */
    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    /**
     * @return the quantity of this item
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity of this item
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the item
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the selling price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price to set at this product, it's the selling price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the item's provider cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost is the provider's cost of this item.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return product ID
     */
    public int getId() {
        return id;
    }

    /**
     * @param id of the product
     */
    public void setId(int id) {
        this.id = id;
    }
}
