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
public class Operator {

    private String id;
    private String name;
    private String emailId;
    private String password;
    private String contactNumber;
    private String companyId;
    private String address;
    private Boolean isActive;
}
