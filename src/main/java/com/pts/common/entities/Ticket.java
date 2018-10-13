package com.pts.common.entities;

import lombok.Builder;
import lombok.Data;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class Ticket {

    private String id;
    private String ticketNumber;
    private String VehicleNumber;
    private String parkingSlotId;
    private String companyId;
}
