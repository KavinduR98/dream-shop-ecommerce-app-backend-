package com.ushan.dream_shops.response;

import com.ushan.dream_shops.dto.ImageDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Object data;
}
