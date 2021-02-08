package io.github.puipuimolcar.ecsite.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import io.github.puipuimolcar.ecsite.model.domain.Product;

@Mapper
public interface ProductMapper {
	
	@Select("SELECT * FROM product")
	List<Product> find();
	
}
