package com.example.demo.templatemethod.concrete;

import com.example.demo.dto.Food;
import com.example.demo.templatemethod.CookGrilledFood;

public class CookGrilledChiken extends CookGrilledFood {
	public void prepareIngredients(Food food){
		food.setStatus("材料を購入しました");
		food.getIngredients().add("チキン");
		food.getIngredients().add("ブロッコリー");
 	}
 	public void grillIngredients(Food food){
 		food.setStatus("200度の温度で15分焼きました");
 	}
 	public void arrangementIngredients(Food food){
 		food.setStatus("高級感あるお皿に配置しました");
 	}
}