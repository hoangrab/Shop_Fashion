package com.shop.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseResponse<T> {
    String status;
    String message;
    T data;
    BaseResponse(String msg,String status) {
        this.message = msg;
        this.status = status;
    }
}
