/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 * @author acardia
 */
public class MeasurementUnit {
    /**
     * An enum that you should use if you care the nature of the measurement;
     */
    private MeasurementUnitType measurementUnitType;
    /**
     * The name of the measurement unit
     */
    private String unitName;
    /**
     * An array that contains all the related measures
     */
    private double measures[];

    /**
     * Creates a new instance of a MeasurementUnit, if you use this constructor
     * then you must use the setters to initialize the values
     *
     * @return MeasurementUnit instance
     */
    public MeasurementUnit() {
    }

    /**
     * Creates a new instance of a MeasurementUnit.
     *
     * @return MeasurementUnit instance
     */
    public MeasurementUnit(
        MeasurementUnitType measurementUnitType,
        String unitName,
        double measures[]) {
        this.measurementUnitType = measurementUnitType;
        this.unitName = unitName;
        this.measures = measures;
    }

    /**
     * Creates a new instance of a MeasurementUnit.
     *
     * @return MeasurementUnit instance
     * @throws Exception if the measurement unit is not valid
     */
    public MeasurementUnit(
        int measurementUnitType,
        String unitName,
        double measures[]) throws Exception {
        this.unitName = unitName;
        this.measures = measures;
        switch (measurementUnitType) {
            case 1:
                this.measurementUnitType = MeasurementUnitType.SIZE;
                break;
            case 2:
                this.measurementUnitType = MeasurementUnitType.WEIGHT;
                break;
            case 3:
                this.measurementUnitType = MeasurementUnitType.VOLUME;
                break;
            default:
                throw new Exception("Not implemented yet");
        }
    }

    /**
     * @return the measurementUnitType
     */
    public MeasurementUnitType getMeasurementUnitType() {
        return measurementUnitType;
    }

    /**
     * @param measurementUnitType the measurementUnitType to set
     */
    public void setMeasurementUnitType(MeasurementUnitType measurementUnitType) {
        this.measurementUnitType = measurementUnitType;
    }

    /**
     * @return the unitName
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName the unitName to set
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return the measures
     */
    public double[] getMeasures() {
        return measures;
    }

    /**
     * @param measures the measures to set
     */
    public void setMeasures(double[] measures) {
        this.measures = measures;
    }
}
