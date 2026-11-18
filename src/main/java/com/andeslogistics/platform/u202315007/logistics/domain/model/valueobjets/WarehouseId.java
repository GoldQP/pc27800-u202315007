package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

import java.util.UUID;
/**
 * Represents the unique identifier for a warehouse.
 */

public record WarehouseId (UUID value) {
    /**
     * Constructs a WarehouseId with the specified value.
     *
     * @param value the UUID value of the warehouse ID
     * @throws IllegalArgumentException if the value is null
     */
    public WarehouseId {
        if (value == null) {
            throw new IllegalArgumentException("Warehouse ID cannot be null");
        }
    }
}
