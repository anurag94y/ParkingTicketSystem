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
public class Ticket {
    @Id
    private ObjectId _id;
    private String uniqueId;
    private String VehicleNumber;
    private Long parkingSlotId;
    private Long companyId;
}
