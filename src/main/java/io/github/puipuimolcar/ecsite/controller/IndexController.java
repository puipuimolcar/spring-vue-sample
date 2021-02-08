package io.github.puipuimolcar.ecsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import io.github.puipuimolcar.ecsite.model.mapper.ProductMapper;
import io.github.puipuimolcar.ecsite.model.session.LoginSession;
import io.github.puipuimolcar.ecsite.model.domain.Product;

@Controller
@RequestMapping("/sampleweb")
public class IndexController {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	@Autowired
	Gson gson = new Gson();
	
	@RequestMapping("/")
	public String index(Model m) {
		if (!loginSession.getLogined() && loginSession.getTmpUserId() == 0) {
			int tmpUserId = (int)(Math.random() * 1000000000 * -1);
			// 仮ユーザーIDが9桁になるまで10倍する
			while (tmpUserId > -100000000) {
				tmpUserId *= 10;
			}
			loginSession.setTmpUserId(tmpUserId);
		}
		return "index";
	}
	
	@RequestMapping("/products")
	@ResponseBody
	public  String products() {
		  List<Product> products = productMapper.find();
		  return gson.toJson(products);
	}
	
}
