public class Main {
    public static void main(String[] args) {

    ApplePieRecipe applePie = new ApplePieRecipe();

    applePie.printIngredients();
    applePie.printRecipe();


    BlueberryCrumbleRecipe blueberryCrumble = new BlueberryCrumbleRecipe();

    blueberryCrumble.printIngredients();
    blueberryCrumble.printRecipe();


        System.exit(0);

    applePie.preHeatOven();
    applePie.whiskEgg();
    applePie.mixIngredients();
    applePie.sliceApples();
    applePie.greaseBakingTray();
    applePie.coverBakingTray();
    applePie.addApples();
    applePie.rollDough();
    applePie.createCrust();
    applePie.putInOven();

    }
}