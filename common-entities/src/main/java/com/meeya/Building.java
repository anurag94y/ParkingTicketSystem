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
public class Building {
    private Long id;
    private List<Long> companyIds;
    private List<Long> parkingSlotIds;
}
