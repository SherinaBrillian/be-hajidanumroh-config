package com.sherina.hajidanumroh.price.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse<T> {
    private String status;
    private T data; 
    
}