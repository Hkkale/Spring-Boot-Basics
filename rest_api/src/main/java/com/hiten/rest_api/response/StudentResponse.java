package com.hiten.rest_api.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private int statusCode;
    private String message;
    private long timeStamp;
}
