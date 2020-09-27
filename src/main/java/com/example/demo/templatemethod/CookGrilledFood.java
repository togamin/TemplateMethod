package com.example.demo.templatemethod;

import com.example.demo.dto.Food;

public abstract class CookGrilledFood {
	/**
	 * 材料の準備
	 * @param food
	 */
	public abstract void prepareIngredients(Food food);
	
	/**
	 * 材料を焼く
	 * @param food
	 */
 	public abstract void grillIngredients(Food food);
 	/**
 	 * 材料を並べる
 	 * @param food
 	 */
 	public abstract void arrangementIngredients(Food food);
 	
 	/**
 	 * グリルフードを料理する手順
 	 * @param food
 	 */
 	public void cookGrilledFood(){
 		Food food = new Food();
 		prepareIngredients(food);
 		System.out.println(food.getStatus() + " : " + food.getIngredientsName());
 		grillIngredients(food);
 		System.out.println(food.getStatus() + " : " + food.getIngredientsName());
 		arrangementIngredients(food);
 		System.out.println(food.getStatus() + " : " + food.getIngredientsName());
 	}
}