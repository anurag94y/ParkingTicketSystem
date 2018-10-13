package com.pts.common.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class Company {
    @Id
    private ObjectId _id;
    private String name;
    private String emailId;
    private String contactNumber;
    private String address;
    private List<Long> buildingIds;
}
