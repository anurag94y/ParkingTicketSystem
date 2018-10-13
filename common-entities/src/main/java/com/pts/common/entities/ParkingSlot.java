package com.pts.common.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class ParkingSlot {
    @Id
    private ObjectId _id;
    private Long buildingId;
    private Long companyId;
    private VehicleType vehicleType;
    private Boolean isReserved;
    private Boolean isVacant;
    private String floorNumber;
}
