package com.shop.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {
    @NotBlank(message = "Name can not blank")
    private String name;
    private long parentId;
}
