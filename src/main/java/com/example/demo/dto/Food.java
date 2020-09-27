package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class Food {
	/**
	 * 食料の状態
	 */
	private String status;
	/**
	 * 材料
	 */
	private List<String> ingredients = new ArrayList<>();
	
	public String getIngredientsName() {
		String ingredientsName = "";
		for (String ingredient:this.ingredients) {
			ingredientsName += " " + ingredient;
		}
		return ingredientsName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<String> getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
}
