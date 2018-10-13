package com.pts.common.entities;


import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class Building {
    @Id
    private ObjectId _id;
    private List<Long> companyIds;
    private List<Long> parkingSlotIds;
}
