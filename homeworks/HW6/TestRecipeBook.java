public class TestRecipeBook {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ingredients Class Test");
        System.out.println();
        Ingredient sugar = new Ingredient("Sugar", "grams", 4);
        Ingredient salt = new Ingredient("Salt", "grams", 0);
        System.out.println(sugar);
        System.out.println("sugar.getName() = " + sugar.getName());
        System.out.println("sugar.getMeasuringUnit() = " + sugar.getMeasuringUnit());
        System.out.println("sugar.getCaloriesPerUnit() = " + sugar.getCaloriesPerUnit());
        System.out.println("sugar.equals(salt) = " + sugar.equals(salt));
        System.out.println();
        sugar.setName("Brown Sugar");
        sugar.setMeasuringUnit("g");
        sugar.setCaloriesPerUnit(5);
        System.out.println("after setMethods = " + sugar);
        System.out.println();

        System.out.println("RecipeIngredient Class Test");
        System.out.println();
        RecipeIngredient flour = new RecipeIngredient("Flour", "grams", 3, 200);
        RecipeIngredient flourSame = new RecipeIngredient("Flour", "grams", 3, 200);
        RecipeIngredient flourHalf = new RecipeIngredient("Flour", "grams", 3, 100);
        System.out.println(flour);
        System.out.println("flour.getQuantity() = " + flour.getQuantity());
        System.out.println("flour.equals(flourCopy) = " + flour.equals(flourSame));
        System.out.println("flour.equals(flourHalf) = " + flour.equals(flourHalf));
        flour.setQuantity(250);
        System.out.println("after setQuantity = " + flour.getQuantity());
        System.out.println();

        System.out.println("CookingRecipe Class Test");
        System.out.println();
        CookingRecipe pancake = new CookingRecipe("Pancake");
        // renaming cooking recipe
        pancake.setName("Delicious Pancake");
        System.out.println("Renamed the Cooking Recipe to " + pancake.getName());
        System.out.println();

        // addOrUpdateRecipeIngredient: adding
        pancake.addOrUpdateRecipeIngredient(flour, flour.getQuantity()); // adding Flour 250
        RecipeIngredient milkRecipeIngredient = new RecipeIngredient("Milk", "ml", 1, 300);
        pancake.addOrUpdateRecipeIngredient(milkRecipeIngredient, milkRecipeIngredient.getQuantity()); // adding Milk 300
        RecipeIngredient eggRecipeIngredient = new RecipeIngredient("Egg", "units", 70, 2);
        pancake.addOrUpdateRecipeIngredient(eggRecipeIngredient, eggRecipeIngredient.getQuantity()); // adding Egg 2

        System.out.println("After adding all ingredients:\n" + pancake);
        System.out.println("getNumberOfIngredients() = " + pancake.getNumberOfIngredients());
        System.out.println("calculateCalories() = " + pancake.calculateCalories());

        // addOrUpdateRecipeIngredient: updating that already exists
        System.out.println();
        pancake.addOrUpdateRecipeIngredient(new RecipeIngredient("Milk", "ml", 1, 350), 350);
        System.out.println("After updating Milk quantity to 350:\n" + pancake);
        System.out.println("getRecipeIngredient(\"Milk\") = " + pancake.getRecipeIngredient("Milk"));

        // getRecipeIngredient by object Ingredient
        Ingredient Milk = new Ingredient("Milk", "ml", 1);
        System.out.println("getRecipeIngredient(Milk) = " + pancake.getRecipeIngredient(Milk));

        // removeRecipeIngredient by name
        RecipeIngredient removedEgg = pancake.removeRecipeIngredient("Egg");
        System.out.println();
        System.out.println("Removing by name \"Egg\" = " + removedEgg);
        System.out.println();
        System.out.println("After removing Egg:\n" + pancake);

        // removeRecipeIngredient by Ingredient object (new instance of class)
        RecipeIngredient removedMilk = pancake.removeRecipeIngredient(new RecipeIngredient("Milk", "ml", 1, 350));
        System.out.println();
        System.out.println("Removing by Ingredient object Milk = " + removedMilk);
        System.out.println("After removing Milk:\n" + pancake);

        // attempt to remove ingredient that's not in the list
        RecipeIngredient removedBanana = pancake.removeRecipeIngredient("Banana");
        System.out.println();
        System.out.println("Removing null Banana = " + removedBanana);
        System.out.println();

        // equals for CookingRecipe
        CookingRecipe pancakeCopy = new CookingRecipe("Pancake");
        pancakeCopy.addOrUpdateRecipeIngredient(new RecipeIngredient("Flour", "grams", 3, 250), 250);
        System.out.println("pancake.equals(copyOfPancake) = " + pancake.equals(pancakeCopy)); // true

        System.out.println();

        System.out.println("RecipeBook Class Test");
        System.out.println();
        RecipeBook book = new RecipeBook("My Cookbook");

        // addRecipe
        RecipeIngredient[] pancakeIngredients = new RecipeIngredient[]{
                new RecipeIngredient("Flour", "grams", 3, 250),
                new RecipeIngredient("Milk", "ml", 1, 300)
        };
        CookingRecipe added = book.addRecipe("Pancake", pancakeIngredients);
        System.out.println("Recipe we added = " + added);

        // add duplicate
        CookingRecipe duplicateAdd = book.addRecipe("Pancake", pancakeIngredients);
        System.out.println();
        System.out.println("Adding duplicate recipe = " + duplicateAdd); // null

        // add another recipe
        RecipeIngredient[] ingredientsOmelette = new RecipeIngredient[]{
                new RecipeIngredient("Egg", "units", 70, 3),
                new RecipeIngredient("Milk", "ml", 1, 200)
        };
        book.addRecipe("Omelette", ingredientsOmelette);
        System.out.println();
        System.out.println("After adding Pancake and Omelette:\n" + book);
        // remove existing Recipe
        CookingRecipe removed = book.removeRecipe("Pancake");
        System.out.println("Removed recipe \"Pancake\" = " + removed);

        // remove null
        CookingRecipe removedNull = book.removeRecipe("Lasagna");
        System.out.println("Attempt to remove null Lasagna = " + removedNull);

        // findRecipes (recipes containing passed params of ingredients)
        RecipeIngredient[] find = new RecipeIngredient[]{
                new RecipeIngredient("Egg", "units", 70, 3)
        };
        CookingRecipe[] found = book.findRecipes(find);
        System.out.println();
        System.out.println("findRecipes (Egg) : length = " + found.length);
        for (CookingRecipe recipe : found)
            System.out.println(recipe.getName());

        // findRecipesWithFewIngredients
        CookingRecipe[] few = book.findRecipesWithFewIngredients(2);
        System.out.println("findRecipesWithFewIngredients(2) : length: " + few.length);
        for (CookingRecipe recipe : few)
            System.out.println(recipe.getName());

        // findRecipesLowCalories
        System.out.println();
        CookingRecipe[] lowCals = book.findRecipesLowCalories();
        System.out.println("findRecipesLowCalories() : length: " + lowCals.length);
        for (CookingRecipe recipe : lowCals) System.out.println(recipe.getName());

        // toString and equals for RecipeBook
        RecipeBook bookCopy = new RecipeBook("My Cookbook");
        bookCopy.addRecipe("Omelette", ingredientsOmelette);
        System.out.println("book.equals(bookCopy) = " + book.equals(bookCopy));

        // renaming book
        System.out.println();
        book.setBookName("My Cookbook of Recipes");
        System.out.println("Renamed Book = " + book.getBookName());

        System.out.println("\nFinal book:\n" + book);
    }
}