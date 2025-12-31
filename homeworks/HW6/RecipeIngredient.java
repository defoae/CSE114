public class RecipeIngredient extends Ingredient{
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity){
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public void setQuantity(float quantity){
        this.quantity = quantity;
    }

    public float getQuantity(){
        return this.quantity;
    }

    public String toString(){
        return super.toString() + "\nquantity=" + this.quantity;
    }

    public boolean equals(Object ingredient){
        if (ingredient == null)
            return false;
        RecipeIngredient casted = (RecipeIngredient)ingredient;
        return casted.getQuantity() == this.quantity && super.equals(casted);
    }
}
