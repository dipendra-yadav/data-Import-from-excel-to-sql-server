package com.uploadexcel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.uploadexcel.service.ProductAttributesDetailsService;

@RestController
@RequestMapping("/uplaodexcel")
public class ProductAttributesDetailsController {

	@Autowired
	private ProductAttributesDetailsService productAttributesDetailsService;

	@PostMapping("excel")
	public void uploadExcel(@RequestParam("file") MultipartFile excelfile) throws Exception {
		
		productAttributesDetailsService.uploadExcel(excelfile);
	}

}
