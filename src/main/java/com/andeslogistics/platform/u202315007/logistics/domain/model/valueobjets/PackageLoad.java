package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

public record PackageLoad (Integer quantity, String unit) {
    public PackageLoad {
        if (quantity == null || quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }



}
