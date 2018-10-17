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
public class Ticket {

    private String ticketId;
    private String ticketNumber;
    private String VehicleNumber;
    private String parkingSlotId;
    private String companyId;
}
