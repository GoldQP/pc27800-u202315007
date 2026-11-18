package com.andeslogistics.platform.u202315007.logistics.domain.model.valueobjets;

import java.time.LocalDate;
/**
 * Represents a delivery window with a start and end date.
 */

public record DeliveryWindow (LocalDate startDate, LocalDate endDate) {
    public DeliveryWindow{
        /**
         * Constructs a DeliveryWindow with the specified start and end dates.
         *
         * @param startDate the start date of the delivery window
         * @param endDate the end date of the delivery window
         * @throws IllegalArgumentException if either date is null or if the end date is not after the start date
         */
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }
        if(!endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("End date must be after start date");
        }
    }

    public boolean includes(LocalDate checkDate){
        /**
         * Checks if the specified date falls within the delivery window.
         *
         * @param checkDate the date to check
         * @return true if the date is within the window, false otherwise
         * @throws IllegalArgumentException if the check date is null
         */
        if (checkDate == null) {
            throw  new IllegalArgumentException("Check date cannot be null");
        }
        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }
}
