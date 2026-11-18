package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

public record PackageLoad (Integer quantity, String unit) {
    /**
     * Constructs a PackageLoad with the specified quantity and unit.
     *
     * @param quantity the quantity of the package load
     * @param unit     the unit of measurement for the package load
     * @throws IllegalArgumentException if the quantity is null or less than or equal to zero,
     *                                  or if the unit is null or blank
     */
    public PackageLoad {
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }
    /**
     * Increases the quantity of the package load by the specified additional quantity.
     *
     * @param additionalQuantity the quantity to add
     * @return a new PackageLoad instance with the updated quantity
     * @throws IllegalArgumentException if the additional quantity is null or less than or equal to zero,
     *                                  or if the resulting quantity exceeds Integer.MAX_VALUE
     */
    public PackageLoad increaseBy(Integer additionalQuantity) {
        if (additionalQuantity == null || additionalQuantity <= 0) {
            throw new IllegalArgumentException("Additional quantity must be greater than zero");
        }
        long sum = (long) this.quantity + additionalQuantity;
        if (sum > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Resulting quantity exceeds maximum integer value");
        }
        return new PackageLoad(this.quantity + additionalQuantity, this.unit);
    }



}
