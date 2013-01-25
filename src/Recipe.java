/*
 * Program Name: Recipe Application
 * author: Vairon M. 
 * date: Feb/06/2012 
 * Computer used: HP Compaq 6000 Pro Microtower
 * IDE used: Eclipse IDE
 * purpose: Provide the user with a simple/flexible recipe organizer application 
 */

public class Recipe
{
	private String recipeName, authorName, recipeDescription;
	// Mastery factor # 1 Arrays
	private String[] ingredientName = new String[40], ingredientUnits = new String[40];
	private Double[] ingredientAmounts = new Double[40];
	private int ratingValue, servingSize;

	// Initializing variables
	public Recipe()
	{
		recipeName = "";
		authorName = "";
		ratingValue = 0;
		servingSize = 0;
		recipeDescription = "";

		for (int init = 0; init < ingredientName.length; init++)
		{
			ingredientName[init] = "";
			ingredientUnits[init] = "";
			ingredientAmounts[init] = 0.0;
		}
	}

	// Mastery factors # 9 User-defined methods with parameters
	public void setRecipeName(String rName)
	{
		recipeName = rName;
	}

	// Mastery factors # 9 User-defined methods with parameters
	public void setAuthorName(String aName)
	{
		authorName = aName;
	}

	/*
	 * Set Ingredient's name at an specific location in the array
	 */
	// Mastery factors # 9 User-defined methods with parameters
	public void setIngredients(String ingredients, int location)
	{
		ingredientName[location] = ingredients;
	}

	/*
	 * Set Ingredient's unit at an specific location
	 */
	// Mastery factors # 9 User-defined methods with parameters
	public void setIngredientUnits(String uNames, int location)
	{
		ingredientUnits[location] = uNames;
	}

	/*
	 * Set Ingredients's amount at an specific location
	 */
	// Mastery factors # 9 User-defined methods with parameters
	public void setIngredientAmounts(Double aValue, int location)
	{
		ingredientAmounts[location] = aValue;
	}

	public void setIngredientArray(String ingredients[])
	{
		ingredientName = ingredients;
	}

	public void setIngredientUnitArray(String uNames[])
	{
		ingredientUnits = uNames;
	}

	public void setIngredientAmountArray(Double[] aValue)
	{
		ingredientAmounts = aValue;
	}

	public void setRecipeDescription(String rDescription)
	{
		recipeDescription = rDescription;
	}

	public void setRating(int rValue)
	{
		ratingValue = rValue;
	}

	public void setServing(int sSize)
	{
		servingSize = sSize;
	}

	public String getRecipeName()
	{
		return recipeName;
	}

	public String getAuthor()
	{
		return authorName;
	}

	public String[] getIngredients()
	{
		return ingredientName;
	}

	public String[] getUnits()
	{
		return ingredientUnits;
	}

	public Double[] getAmounts()
	{
		return ingredientAmounts;
	}

	public String getDescription()
	{
		return recipeDescription;
	}

	public int getRating()
	{
		return ratingValue;
	}

	// Get serving size
	public int getServing()
	{
		return servingSize;
	}

	/*
	 * Method which will clear all array variables
	 */
	public void emptyIngredients()
	{
		for (int clear = 0; clear < ingredientName.length; clear++)
		{
			ingredientName[clear] = "";
			ingredientUnits[clear] = "";
			ingredientAmounts[clear] = 0.0;
		}
	}

}
