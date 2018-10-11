package com.meeya;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private Long id;
    private String name;
    private String emailId;
    private String contactNumber;
    private String address;
    private List<Long> buildingIds;
}
