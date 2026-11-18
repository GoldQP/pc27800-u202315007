package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

/**
 * Represents the status of a delivery.
 */
public enum DeliveryStatus {
    /**
     * The delivery is pending and has not yet been processed.
     */
    PENDING,
    IN_TRANSIT,
    DELIVERED,
    CANCELLED
}
