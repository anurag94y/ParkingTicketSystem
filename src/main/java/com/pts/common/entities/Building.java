package com.pts.common.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Building {

    private String buildingId;
    private String name;
    private String address;
    private String contactDetail;
    private List<String> companyIds;
    private List<String> parkingSlotIds;
}
