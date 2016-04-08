package com.br.cweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.cweb.mapper.ProvinceMapper;
import com.br.cweb.model.Province;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * 测试controller层
 * @author guanghao.wang@100credit.com
 *
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ProvinceMapper provinceMapper;
	
	@RequestMapping(value = "/say",  method = RequestMethod.GET )
	public String sayHello(@RequestParam(value = "str", required = false) String str){
		log.info("hello:{}", str);
		return str;
	}
	
	@RequestMapping(value = "/list",  method = RequestMethod.GET )
	public String getProList(){
		List<Province> provinceList = provinceMapper.getAll( new Province());
		ObjectMapper mapper = new ObjectMapper();
		return mapper.createObjectNode().set("list",  mapper.valueToTree(provinceList)).toString();
	}
}
