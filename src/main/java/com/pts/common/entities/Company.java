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
public class Company {

    private String id;
    private String name;
    private String emailId;
    private String contactNumber;
    private String address;
    private List<String> buildingIds;
}
