package com.pts.common.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ParkingSlot {

    private String parkingSlotId;
    private String buildingId;
    private String companyId;
    private VehicleType vehicleType;
    private ParkingSlotVacantStatus vacantStatus;
    private Boolean isReserved;
    private String floorNumber;
    private String slotNumber;
}
