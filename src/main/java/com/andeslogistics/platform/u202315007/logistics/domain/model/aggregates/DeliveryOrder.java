package com.andeslogistics.platform.u202315007.logistics.domain.model.aggregates;

import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.*;


public class DeliveryOrder {
    private Long id;
    private DeliveryCode deliveryCode;
    private WarehouseId warehouseId;
    private DeliveryWindow deliveryWindow;
    private PackageLoad packageLoad;
    private Integer priorityLevel;
    private DeliveryStatus status;
    private String deliveryNotes;


    public DeliveryOrder(DeliveryCode deliveryCode, WarehouseId warehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad) {
        this.deliveryCode = deliveryCode;
        this.warehouseId = warehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;

        if(priorityLevel == null || priorityLevel < 1 || priorityLevel > 5) {
            throw new IllegalArgumentException("Priority level must be between 1 and 5");
        }
        this.priorityLevel = priorityLevel;

        this.status= DeliveryStatus.PENDING;
        this.deliveryNotes = deliveryNotes;
    }
}
