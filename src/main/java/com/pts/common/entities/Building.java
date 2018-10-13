package com.pts.common.entities;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class Building {
    private String id;
    private String name;
    private String address;
    private String contactDetail;
    private List<String> companyIds;
    private List<String> parkingSlotIds;
}
