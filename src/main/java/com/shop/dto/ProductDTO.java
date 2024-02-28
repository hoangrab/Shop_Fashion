package com.shop.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    @NotBlank(message = "title can not blank")
    private String title;
    @NotNull(message = "price can not null")
    @Min(value = 0,message = "price can not smaller than 0")
    private long price;
    @NotNull(message = "category id can not null")
    private Long categoryId;
    private long discount;
    private String description;
    private MultipartFile thumbnail;
    List<MultipartFile> files;
}
