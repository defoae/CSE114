import java.util.ArrayList;

public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredientsList = new ArrayList<RecipeIngredient>();

    public CookingRecipe(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<RecipeIngredient> getIngredientsList() {
        return this.ingredientsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        if (ingredient == null)
            return;
        for (RecipeIngredient recipeIngredient : this.ingredientsList) {
            if (recipeIngredient.getName().equals(ingredient.getName())
                    && recipeIngredient.getMeasuringUnit().equals(ingredient.getMeasuringUnit())) {
                recipeIngredient.setQuantity(quantity);
                recipeIngredient.setCaloriesPerUnit((int) ingredient.getCaloriesPerUnit());
                return;
            }
        }
        if (ingredient instanceof RecipeIngredient) {
            RecipeIngredient castedObject = (RecipeIngredient) ingredient;
            RecipeIngredient newIngredient = new RecipeIngredient(
                    castedObject.getName(),
                    castedObject.getMeasuringUnit(),
                    (int) castedObject.getCaloriesPerUnit(),
                    quantity
            );
            this.ingredientsList.add(newIngredient);
        } else {
            RecipeIngredient newIngredient = new RecipeIngredient(
                    ingredient.getName(),
                    ingredient.getMeasuringUnit(),
                    (int) ingredient.getCaloriesPerUnit(),
                    quantity
            );
            this.ingredientsList.add(newIngredient);
        }
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        if (ingredient == null)
            return null;
        for (RecipeIngredient recipeIngredient : this.ingredientsList) {
            if (recipeIngredient.getName().equals(ingredient.getName())
                    && recipeIngredient.getMeasuringUnit().equals(ingredient.getMeasuringUnit())) {
                return recipeIngredient;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        if (ingredientName == null)
            return null;
        for (RecipeIngredient ingredient : this.ingredientsList) {
            if (ingredient.getName().equals(ingredientName)) {
                return ingredient;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        if (ingredient == null)
            return null;
        for (int i = 0; i < this.ingredientsList.size(); i++) {
            RecipeIngredient recipeIngredient = this.ingredientsList.get(i);
            if (recipeIngredient.getName().equals(ingredient.getName())
                    && recipeIngredient.getMeasuringUnit().equals(ingredient.getMeasuringUnit())) {
                this.ingredientsList.remove(i);
                return recipeIngredient;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        if (ingredientName == null)
            return null;
        for (int i = 0; i < this.ingredientsList.size(); i++) {
            RecipeIngredient recipeIngredient = this.ingredientsList.get(i);
            if (recipeIngredient.getName().equals(ingredientName)) {
                this.ingredientsList.remove(i);
                return recipeIngredient;
            }
        }
        return null;
    }

    public float calculateCalories() {
        float sum = 0;
        for (RecipeIngredient ingredient : this.ingredientsList) {
            sum += ingredient.getCaloriesPerUnit() * ingredient.getQuantity();
        }
        return sum;
    }

    public int getNumberOfIngredients() {
        return this.ingredientsList.size();
    }

    public String toString() {
        return "Cooking Recipe\n" + "name=" + this.name + "\nList of Ingredients: " + helper();
    }

    private String helper() {
        String message = "\n";
        for (RecipeIngredient ingredient : this.ingredientsList) {
            message += "•" + ingredient.toString() + "\n";
        }
        return message;
    }

    public boolean equals(Object cookingRecipe) {
        if (cookingRecipe == null)
            return false;
        CookingRecipe casted = (CookingRecipe)cookingRecipe;
        return casted.toString().equals(this.toString());
    }
}

