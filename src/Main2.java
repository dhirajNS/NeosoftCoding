public class Main2 {

    public static void main(String[] args) {
        //Using builder we have created the object and we as implementer of builder pattern need to assure that this is not inconsistent object.
        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();

        System.out.println(burger.toString()+" <<Burger>>>");
        //GOF Builder example
        //Meal meal = new MealDirector(new VegMealBuilder()).prepareMeal();
    }
}