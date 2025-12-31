import java.util.ArrayList;

public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipesList = new ArrayList<CookingRecipe>();

    public RecipeBook(String bookName){
        this.bookName = bookName;
    }

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public String getBookName(){
        return this.bookName;
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
        if (name == null)
            return null;
        for (CookingRecipe recipe : this.recipesList){
            if(recipe.getName().equals(name))
                return null;
        }
        CookingRecipe newRecipe = new CookingRecipe(name);
        if (ingredients != null) {
            for (RecipeIngredient recipeIngredient : ingredients){
                newRecipe.addOrUpdateRecipeIngredient(recipeIngredient, recipeIngredient.getQuantity());
            }
        }
        this.recipesList.add(newRecipe);
        return newRecipe;
    }

    public CookingRecipe removeRecipe(String name){
        int index = 0;
        CookingRecipe forDisplay = null;
        boolean found = false;
        for (CookingRecipe recipe : this.recipesList){
            if(recipe.getName().equals(name)){
                index = this.recipesList.indexOf(recipe);
                forDisplay = recipe;
                found = true;
                break;
            }
        }
        if(!found)
            return null;
        this.recipesList.remove(index);
        return forDisplay;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
        ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
        if (ingredients == null) return new CookingRecipe[0];
        for (CookingRecipe recipe : this.recipesList){
            boolean match = true;
            for(RecipeIngredient ingredient : ingredients){
                if(recipe.getRecipeIngredient(ingredient) == null) {
                    match = false;
                    break;
                }
            }
            if(match)
                result.add(recipe);
        }
        return result.toArray(new CookingRecipe[result.size()]);
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
        ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
        for (CookingRecipe recipe : this.recipesList){
            if(recipe.getIngredientsList().size() <= numberOfIngredients)
                result.add(recipe);
        }
        return result.toArray(new CookingRecipe[result.size()]);
    }

    public CookingRecipe[] findRecipesLowCalories(){
        if (this.recipesList.isEmpty())
            return null;

        float comparison = this.recipesList.get(0).calculateCalories(); // first element
        ArrayList<CookingRecipe> result = new ArrayList<CookingRecipe>();
        result.add(this.recipesList.get(0));

        for (int i = 1; i < this.recipesList.size(); i++){
            CookingRecipe recipe = this.recipesList.get(i);
            float c = recipe.calculateCalories();
            if (c == comparison){
                result.add(recipe);
            } else if (c < comparison){
                comparison = c;
                result.clear();
                result.add(recipe);
            }
        }
        return result.toArray(new CookingRecipe[result.size()]);
    }

    public String toString(){
        return "Recipe Book\n" + "name: " + this.bookName + "\nList of Recipes:\n" + helper();
    }

    private String helper(){
        String message = "";
        for (CookingRecipe recipe : this.recipesList){
            message += "\n-" + recipe.toString();
        }
        return message;
    }

    public boolean equals(Object recipeBook){
        if (recipeBook == null)
            return false;
        RecipeBook casted = (RecipeBook)recipeBook;
        return casted.toString().equals(this.toString());
    }
}

