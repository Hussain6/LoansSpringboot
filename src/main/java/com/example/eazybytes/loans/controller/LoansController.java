package com.example.eazybytes.loans.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eazybytes.loans.constants.LoansConstants;
import com.example.eazybytes.loans.dto.ResponseDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
@Validated
public class LoansController {

	@PostMapping("/create")
	public  ResponseEntity<ResponseDto> createLoan() {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDto(LoansConstants.STATUS_201, LoansConstants.MESSAGE_201));
	}

}
