package com.andeslogistics.platform.u202315007.logistics.domain.repositories;

import com.andeslogistics.platform.u202315007.logistics.domain.model.aggregates.DeliveryOrder;
import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.DeliveryCode;
import com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets.PackageLoad;
import org.hibernate.internal.util.Optional;

public interface DeliveryOrderRepository {
    /**
     * Finds a delivery order by its unique identifier.
     *
     * @param id the unique identifier of the delivery order
     * @return an Optional containing the found DeliveryOrder, or empty if not found
     */
    Optional<DeliveryOrder> findById(long id);
    DeliveryOrder save(DeliveryOrder deliveryOrder);
    boolean update(DeliveryOrder deliveryOrder);
    boolean delete(DeliveryOrder deliveryOrder);
    boolean existsById(String id);
    Optional<DeliveryOrder> findByDeliveryCode(DeliveryCode deliveryCode);
    Optional<DeliveryOrder> findByPackageLoad(PackageLoad packageLoad);

}
