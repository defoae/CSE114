public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName(){
        return this.name;
    }

    public float getCaloriesPerUnit(){
        return this.caloriesPerUnit;
    }

    public String getMeasuringUnit(){
        return this.measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit){
        this.measuringUnit = measuringUnit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCaloriesPerUnit(int caloriesPerUnit){
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String toString(){
        return "Ingredient\n" +
                "name=" + this.name + "\n" +
                "measuringUnit=" + this.measuringUnit + "\n" +
                "caloriesPerUnit=" + this.caloriesPerUnit;
    }

    public boolean equals(Object ingredient){
        if (ingredient == null)
            return false;
        Ingredient casted = (Ingredient)ingredient;
        return casted.getName().equals(this.name)
                && casted.getCaloriesPerUnit() == this.caloriesPerUnit
                && casted.getMeasuringUnit().equals(this.measuringUnit);
    }
}

