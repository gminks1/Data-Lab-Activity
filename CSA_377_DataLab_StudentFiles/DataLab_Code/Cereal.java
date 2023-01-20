public class Cereal {
    //Name,Type,Calories,Protein,Fat,Sodium,Fiber,Carbohydrates,Sugar,Potassium,Vitamins,Shelf,Weight,Cups,Rating
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbs;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    public static void main(String[] args){
        Cereal basic4 = new Cereal(basic4, C, 130, 3 ,2 , 210, 2, 18, 8, 100, 25, 3 , 1.33, 0.75, 37.038562);
    }

    public Cereal (String n , String t, int cal, int p, int fa, int s, int fib, int carb, int sug, int pot, int vit, int she, double wei, double cup, double rat){
        n = name;
        t = type;
        cal = calories;
        p = protein;
        fa = fat;
        s = sodium;
        fib = fiber;
        carb = carbs;
        sug = sugar;
        pot = potassium;
        vit = vitamins;
        she = shelf;
        wei = weight;
        cup = cups;
        rat = rating;
    }

    //getters
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    int getCalories(){
        return calories;
    }
    int getProtein(){
        return protein;
    }
    int getFat(){
        return fat;
    }
    int getSodium(){
        return sodium;
    }
    int getFiber(){
        return fiber;
    }
    int getCarbs(){
        return carbs;
    }
    int getSugar(){
        return sugar;
    }
    int getPotassium(){
        return potassium;
    }
    int getVitamins(){
        return vitamins;
    }
    int getSelf(){
        return shelf;
    }
    double getWeight(){
        return weight;
    }
    double getCups(){
        return cups;
    }
    double getRating(){
        return rating;
    }

    public String toString(){
        return name + " " + type + " " + calories + " " +  protein + " " +  fat + " " + sodium + " " +  fiber + " " +  carbs + " " +  sugar + " " +  potassium + " " +  vitamins + " " +  shelf + " " +  weight + " " +  cups + " " +  rating;
    }


    
}
