package com.pts.common.entities;

import lombok.Builder;
import lombok.Data;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class ParkingSlot {

    private String id;
    private String buildingId;
    private String companyId;
    private VehicleType vehicleType;
    private Boolean isReserved;
    private Boolean isVacant;
    private String floorNumber;
}
