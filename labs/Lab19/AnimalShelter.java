package Lab19;

import java.util.ArrayList;

public class AnimalShelter {
    private ArrayList <Dog> dogList = new ArrayList<Dog>();
    private ArrayList <Cat> catList = new ArrayList<Cat>();

    public AnimalShelter(){}

    public void addPet(Animal pet){
        if(pet instanceof Dog){
            dogList.add((Dog)pet);
        }
        else if(pet instanceof Cat){
            catList.add((Cat)pet);
        }
    }

    public String adoptOldestDog(){
        Dog temp = dogList.get(0);
        int index = 0;
        for (int i = 1; i < dogList.toArray().length; i++){
            if (dogList.get(i).getAge() <= 10 && dogList.get(i).getAge() > temp.getAge()){
                temp = dogList.get(i);
                index = i;
            }
        }
        if(temp.getAge() <= 10){
            dogList.remove(index);
            return temp.toString();
        }
        else return null;
    }

    public String adoptLongestResidentCat(){
        Cat temp = catList.get(0);
        int index = 0;
        for (int i = 1; i < catList.toArray().length; i++){
            if (catList.get(i).getYearsAtShelter() > temp.getYearsAtShelter()){
                temp = catList.get(i);
                index = i;
            }
        }
        catList.remove(index);
        return temp.toString();
    }

    public static void main(String[] args){
        AnimalShelter shelter = new AnimalShelter();
        Dog dog1 = new Dog("Bob", 5.1, 3);
        Dog dog2 = new Dog("Toby", 5.8, 0.5);
        Dog dog3 = new Dog("Lola", 15, 3);
        Dog dog4 = new Dog("Ruby", 6.4, 0.3);
        Cat cat1 = new Cat("Lucky", 7, 6.5);
        Cat cat2 = new Cat("Ginger", 11, 10);
        Cat cat3 = new Cat("Bella", 2, 1);
        shelter.addPet(dog1);
        shelter.addPet(dog2);
        shelter.addPet(dog3);
        shelter.addPet(dog4);
        shelter.addPet(cat1);
        shelter.addPet(cat2);
        shelter.addPet(cat3);
        System.out.println(shelter.adoptLongestResidentCat());
        // Ginger: 11 years old, 10 years at the shelter
        System.out.println(shelter.adoptOldestDog());
        // Ruby: 6.4 years old, 0.3 years at the shelter
        System.out.println(shelter.adoptOldestDog());
        // Toby: 5.8 years old, 0.5 years at the shelter
        System.out.println(shelter.adoptOldestDog());
        // Bob: 5.1 years old, 3 years at the shelter
        System.out.println(shelter.adoptOldestDog());
        // null
        System.out.println(shelter.adoptLongestResidentCat());
        // Lucky: 7 years old, 6.5 years at the shelter
    }
}
