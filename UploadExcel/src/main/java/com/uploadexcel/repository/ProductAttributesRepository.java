package com.uploadexcel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uploadexcel.model.ProductAttributesDetails;
import com.uploadexcel.model.ProductAttributesDetailsTO;


public interface ProductAttributesRepository  //extends JpaRepository<ProductAttributesDetails, String>
{
	public void save(List<ProductAttributesDetailsTO> pLists);
}
