package com.shop.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class ErrorResponse<T> extends BaseResponse{
    public ErrorResponse(String msg) {
        super(msg,"failure");
    }
}
