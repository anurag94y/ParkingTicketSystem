package com.meeya;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSlot {
    private Long id;
    private Long buildingId;
    private Long companyId;
    private VehicleType vehicleType;
    private Boolean isReserved;
    private Boolean isVacant;
    private String floorNumber;
}
