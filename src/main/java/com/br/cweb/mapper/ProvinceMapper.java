package com.br.cweb.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.br.cweb.model.Province;

@Repository
public interface ProvinceMapper {
   public  List<Province> getAll(Province province);
}
