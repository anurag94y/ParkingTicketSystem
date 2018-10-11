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
public class Ticket {
    private Long id;
    private String uniqueId;
    private String VehicleNumber;
    private Long parkingSlotId;
    private Long companyId;
}
