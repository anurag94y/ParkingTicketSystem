package com.pts.common.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * @author anurag.y
 * @since 08/10/18.
 */
@Data
@Builder
public class Operator {
    @Id
    private ObjectId _id;
    private String name;
    private String emailId;
    private String password;
    private String contactNumber;
    private Long companyId;
    private String address;
    private Boolean isActive;
}
