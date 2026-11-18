package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

public record DeliveryCode (String code){
    /**
     * Constructs a DeliveryCode with the specified code.
     *
     * @param code the delivery code
     * @throws IllegalArgumentException if the code is null or blank
     */

    public DeliveryCode{
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Delivery code cannot be null or blank");
        }
    }

}
