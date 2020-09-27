package com.example.demo.templatemethod.concrete;

import com.example.demo.dto.Food;
import com.example.demo.templatemethod.CookGrilledFood;

public class CookGrilledPork extends CookGrilledFood{
	public void prepareIngredients(Food food){
		food.setStatus("材料を冷蔵庫から取り出しました");
		food.getIngredients().add("ポーク");
		food.getIngredients().add("とうもろこし");
 	}
 	public void grillIngredients(Food food){
 		food.setStatus("150度の温度で10分焼きました");
 	}
 	public void arrangementIngredients(Food food){
 		food.setStatus("お子様プレートに配置しました");
 	}
}
