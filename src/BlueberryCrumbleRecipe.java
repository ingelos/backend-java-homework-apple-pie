public class BlueberryCrumbleRecipe {

    Ingredient blueberries = new Ingredient(400, "gram", "blauwe bessen");
    Ingredient lemon = new Ingredient(1, "stuks", "lemon (organic)");
    Ingredient buckwheatFlour = new Ingredient(2, "el", "boekweitmeel");
    Ingredient cinnamon = new Ingredient(0.5, "tl", "kaneelpoeder");
    Ingredient nuts = new Ingredient(100, "gram", "walnoten of pecannoten");
    Ingredient coconutOil = new Ingredient(2, "el", "kokosolie");
    Ingredient buckwheatFlourTopping = new Ingredient(50, "gr", "boekweitmeel");
    Ingredient sunFlourSeeds = new Ingredient(40, "gram", "zonnebloempitten");
    Ingredient salt = new Ingredient(1, "snufje", "zout");
    Ingredient wineStoneBakingPowder  = new Ingredient(2, "tl",  "wijnsteenbakpoeder");
    Ingredient oatmeal = new Ingredient(40, "gram", "havermout");
    Ingredient coconutSugar = new Ingredient(1, "el", "kokosbloesemsuiker (optioneel) of");
    Ingredient honey = new Ingredient(3, "el", "honey (optioneel)");


    public void printIngredients() {
        System.out.println("Blueberry Crumble (4 personen) - Rens Kroes\n");
        System.out.println("Ingredienten voor de vulling:");
        System.out.println(blueberries.getAmount() + " " + blueberries.getUnit() + " " + blueberries.getName());
        System.out.println(lemon.getAmount() + " " + lemon.getUnit() + " " + lemon.getName());
        System.out.println(buckwheatFlour.getAmount() + " " + buckwheatFlour.getUnit() + " " + buckwheatFlour.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName() + "\n");
        System.out.println("Ingredienten voor de topping:");
        System.out.println(nuts.getAmount() + " " + nuts.getUnit() + " " + nuts.getName());
        System.out.println(coconutOil.getAmount() + " " + coconutOil.getUnit() + " " + coconutOil.getName());
        System.out.println(buckwheatFlourTopping.getAmount() + " " + buckwheatFlourTopping.getUnit() + " " + buckwheatFlourTopping.getName());
        System.out.println(sunFlourSeeds.getAmount() + " " + sunFlourSeeds.getUnit() + " " + sunFlourSeeds.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(wineStoneBakingPowder.getAmount() + " " + wineStoneBakingPowder.getUnit() + " " + wineStoneBakingPowder.getName());
        System.out.println(oatmeal.getAmount() + " " + oatmeal.getUnit() + " " + oatmeal.getName());
        System.out.println(coconutSugar.getAmount() + " " + coconutSugar.getUnit() + " " + coconutSugar.getName());
        System.out.println(honey.getAmount() + " " + honey.getUnit() + " " + honey.getName() + "\n");
    }

    public void printRecipe() {
        steps();
        preheatOven();
        rinseBlueberries();
        rinseLemon();
        addDryFilling();
        addDryIngredients();
        ovenDirections();
    }

    public void steps() {
        System.out.println("Bereiding:\n");
    }

    public void preheatOven() {
        System.out.println("Verwarm de oven voor op 180 graden Celcius.");
    }

    public void rinseBlueberries() {
        System.out.println("Spoel de blauwe bessen schoon en doe ze in een kom");
    }

    public void rinseLemon() {
        System.out.println("Was de citroen en rasp een theelepel schil boven de kom. Knijp dan een halve citroen erboven uit");
    }

    public void addDryFilling() {
        System.out.println("Doe het boekweitmeel en kaneel erbij en roer alles goed door elkaar. Spatel het mengsel vervolgens in een ovenschaaltje. Spoel de kom schoon.");
    }

    public void addDryIngredients() {
        System.out.println("Hak voor de topping de walnoten fijn, smelt de kokosolie in een steelpannetje en doe dit samen met het boekweitmeel, zonnebloempitten, zeezout, wijnsteenbakpoeder, havermout en eventueel de suiker of honing in een kom. Hussel alles goed door elkaar en strooi het over de bosbessen.");
    }

    public void ovenDirections() {
        System.out.println("Zet de schaal 35 min. in de oven en laat de crumble daarna 15 min. afkoelen. Het blijft ongeveer een uurtje warm.");
    }


}
