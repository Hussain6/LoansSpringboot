package com.example.eazybytes.loans.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {

private static String statusCode;
private static String statusMsg;

// Constructor
public ResponseDto(String statusCode, String statusMsg) {
    this.statusCode = statusCode;
    this.statusMsg = statusMsg;
}
}
 