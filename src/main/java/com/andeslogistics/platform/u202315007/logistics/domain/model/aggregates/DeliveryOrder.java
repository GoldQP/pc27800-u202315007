package com.andeslogistics.platform.u202315007.logistics.domain.model.aggregates;

import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.DeliveryCode;
import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.DeliveryStatus;
import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.PackageLoad;

/**
 * Represents a delivery order in the logistics system.
 */
public class DeliveryOrder {

    /**
     * The unique identifier for the delivery order.
     */
    private String orderId;
    private DeliveryCode deliveryCode;
    private PackageLoad packageLoad;
    private DeliveryStatus deliveryStatus;

    /**
     * Constructs a DeliveryOrder with the specified delivery code, package load, and delivery status.
     *
     * @param deliveryCode   the delivery code
     * @param packageLoad    the package load
     * @param deliveryStatus the delivery status
     */
    public DeliveryOrder(DeliveryCode deliveryCode, PackageLoad packageLoad, DeliveryStatus deliveryStatus) {
        this.deliveryCode = deliveryCode;
        this.packageLoad = packageLoad;
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * Constructs a DeliveryOrder with the specified order ID, delivery code, package load, and delivery status.
     *
     * @param orderId        the order ID
     * @param deliveryCode   the delivery code
     * @param packageLoad    the package load
     * @param deliveryStatus the delivery status
     */
    public DeliveryOrder(String orderId, DeliveryCode deliveryCode, PackageLoad packageLoad, DeliveryStatus deliveryStatus) {
        this.orderId = orderId;
        this.deliveryCode = deliveryCode;
        this.packageLoad = packageLoad;
        this.deliveryStatus = deliveryStatus;
    }


    /**
     * Returns the order ID of the delivery order.
     *
     * @return the order ID
     */
    public String getOrderId() {
        return orderId;
    }

    public DeliveryCode getDeliveryCode() {
        return deliveryCode;
    }

    public PackageLoad getPackageLoad() {
        return packageLoad;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }
}
