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
public class Operator {
    private Long id;
    private String name;
    private String emailId;
    private String password;
    private String contactNumber;
    private Long companyId;
    private String address;
    private Boolean isActive;
}
