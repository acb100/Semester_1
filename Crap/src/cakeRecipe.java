public class cakeRecipe {
    public static void main(String[] args) {

        // Variables
        int eggs = 4; //stk
        int gramSugar = 300; //gram
        int milk = 2; //dl
        int butter = 50; //gram
        int flour = 250; //gram
        int bakingSoda = 3; //tsk
        int vanilla = 1; //tsk

        // Topping
        int toppingButter = 100; //gram
        int coconutFlour = 150; //gram
        int brownSugar = 225; //gram
        double toppingMilk = 0.5; //dl

        // Baking time
        System.out.println("Bagetid: Ca. 20 min. ved 200 grader - traditionel ovn.");
        System.out.println("Bagetid med fyld: Ca. 5 min. ved 225 grader - traditionel ovn.");

       // Step 1
        System.out.print("\nStep 1: " + "Pisk " + eggs + " æg og sukker (" + gramSugar + " gram). Lyst og luftigt.");

        // Step 2
        System.out.print("\nStep 2: Varm imens mælk ("+milk+" dl) og smør (lillefingervarmt) i en gryde.");

        // Step 3
        System.out.println("\nStep 3: Bland mel (" + flour + " gram) bagepulver (" + bakingSoda + " gram) og vaniljesukker (" + vanilla + " tsk) sammen. " +
                "Vend det forsigtigt, drysset gennem en sigte, i dejen sigtevis med mælkeblandingen.");

        // Step 4
        System.out.println("Step 4: Hæld dejen i en lille bradepande beklædt med bagepapir (ca. 5 x 22 xS 30 cm) og bag kagen midt i ovnen");

        // Step 5
        System.out.println("Step 5: Kom smør (" + toppingButter + " gram), kokosmel (" + coconutFlour + " gram), " +
                "farin (" + brownSugar + " gram) og mælk (" + toppingMilk + " dl) i en tykbundet gryde og bring det i kog under omrøring.");

        // Step 6
        System.out.println("Step 6: Tag kagen ud (den skal være næsten færdigbagt) og skru op for ovnen. Fordel fyldet på kagen og bag den færdig, stadig midt i ovnen\n");

        // Hvad vejer tingene til sammen?
        double totalGram = 200+(60*4)+gramSugar+butter+flour+15+3.5+toppingButter+coconutFlour+brownSugar+50;
        System.out.println("What is the summarized weight of these ingredients: " + totalGram + " gram.");

        // Trækker 10% fra den samlede vægt
        System.out.println("This is not quite correct, as we need take 10% off the weight: " + totalGram/100*90 + " gram.\n");

        // Energifordeling variabler - Alle enheder er i gram
        // Eggs
        double proteinEgg = 6.2;
        int calorieEgg = 68;
        double fatEgg = 4.6;
        double carbEgg = 0.6;

        // Sugar pr. 100 gram
        int calorieSugar = 360;
        double proteinSugar = 0.9;
        int fatSugar = 0;
        double carbSugar = 89.1;

        // Milk pr. 100g (1 dl)
        int calorieMilk = 38;
        double proteinMilk = 3.5;
        double fatMilk = 0.5;
        double carbMilk = 4.8;

        // Flour pr. 100g
        int calorieFlour = 343;
        double proteinFlour = 9.7;
        double fatFlour = 1.5;
        double carbFlour = 69.7;

        // Butter pr. 100g
        int calorieButter = 743;
        double proteinButter = 0.2;
        double fatButter = 82.5;
        int carbButter = 0;

        // Baking soda pr. 100g
        int calorieBakingSoda = 172;
        double proteinBakingSoda = 5.2;
        int fatBakingSoda = 0;
        double carbBakingSoda = 37.8;

        // Vanilla pr. 100g
        int calorieVanilla = 394;
        double proteinVanilla = 0.3;
        double fatVanilla = 0.2;
        int carbVanilla = 97;

        // Coconut flour
        int calorieCoconutFlour = 685;
        double proteinCoconutFlour = 6.5;
        double fatCoconutFlour = 61.3;
        int carbCoconutFlour = 27;

        //Brown sugar
        int calorieBrownSugar = 388;
        int proteinBrownSugar = 0;
        int fatBrownSugar = 0;
        double carbBrownSugar = 95.5;

        // PROTEIN
        // Protein Sum - Cake
        double eggProteinSum = proteinEgg*4;
        double sugarProteinSum = proteinSugar*3;
        double milkProteinSum = proteinMilk*2;
        double butterProteinSum = proteinButter/2;
        double flourProteinSum = (proteinFlour/2)+(proteinFlour*2);
        double bakingSodaProteinSum = proteinBakingSoda/5;
        double vanillaProteinSum = proteinVanilla/3;
        double proteinSum = eggProteinSum+sugarProteinSum+milkProteinSum+butterProteinSum+flourProteinSum+bakingSodaProteinSum+vanillaProteinSum;
        // Protein Sum - Topping
        double coconutFlourProteinSum = (proteinCoconutFlour/2)+proteinCoconutFlour;
        double brownSugarProteinSum = (proteinCoconutFlour/2)+proteinCoconutFlour;
        double milkProteinSumTopping = proteinMilk/2;
        double proteinSumTopping = coconutFlourProteinSum+brownSugarProteinSum+milkProteinSumTopping+proteinButter;

        // CALORIES
        // Calorie sum - Cake
        double eggCalorieSum = calorieEgg*4;
        double sugarCalorieSum = calorieSugar*3;
        double milkCalorieSum = calorieMilk*2;
        double butterCalorieSum = calorieButter/2;
        double flourCalorieSum = (calorieFlour/2)+(calorieFlour*2);
        double bakingSodaCalorieSum = calorieBakingSoda/5;
        double vanillaCalorieSum = calorieVanilla/3;
        double calorieSum = eggCalorieSum+sugarCalorieSum+butterCalorieSum+flourCalorieSum+bakingSodaCalorieSum+vanillaCalorieSum;
        // Calorie Sum - Topping
        double coconutCalorieSum = (calorieCoconutFlour/2)+calorieCoconutFlour;
        double brownSugarCalorieSum = (calorieBrownSugar/2)+(calorieBrownSugar);
        double milkCalorieSumTopping = calorieMilk/2;
        double calorieSumTopping = coconutCalorieSum+brownSugarCalorieSum+milkCalorieSumTopping+butterCalorieSum;

        // PRIS PÅ INGREDIENSERNE (Fra Nemlig.com)
        // Cake
        int eggPrice = 22/4; //10 æg
        int sugarPrice = 8/3; //1 kg
        int milkPrice = 12/8; //1 l
        int butterPrice = 28/4; //200 g
        double flourPrice = 9/8; //2 kg
        double bakingSodaPrice = 11/45; //225 g
        double vanillaPrice = 12/46.66; //140 g

        int coconutPrice = (9/4)*3; //200 g
        double brownSugarPrice = 11/2.22; //500 g
        int butterPriceTopping = 28/2;
        float milkPriceTopping = 12/95;

        double everythingPrice = eggPrice+sugarPrice+milkPrice+butterPrice+flourPrice+bakingSodaPrice+vanillaPrice+coconutPrice+brownSugarPrice+butterPriceTopping+milkPriceTopping;



        // Cake protein outputs
        System.out.println("Cake:");
        System.out.print("Protein fra æg: " + eggProteinSum + " gram.\n");
        System.out.print("Protein fra sukker: " + sugarProteinSum + " gram.\n");
        System.out.print("Protein fra mælk: " + milkProteinSum + " gram.\n");
        System.out.println("Protein fra smør: " + butterProteinSum + " gram.");
        System.out.println("Protein fra hvedemel: " + flourProteinSum + " gram.");
        System.out.println("Protein fra bagepulver: " + bakingSodaProteinSum + " gram.");
        System.out.println("Protein fra vaniljesukker: " + vanillaProteinSum + " gram.");
        System.out.println("Protein i kagen: " + proteinSum + " gram.\n");

        // Topping protein outputs
        System.out.println("Toppings:");
        System.out.println("Protein fra smør: " + proteinButter + " gram.");
        System.out.println("Protein fra kokosmel: " + coconutFlourProteinSum + " gram.");
        System.out.println("Protein fra brun farin: " + brownSugarProteinSum + " gram.");
        System.out.println("Protein fra mælk: " + milkProteinSumTopping + " gram.");
        System.out.println("Protein i hele kagens topping: " + proteinSumTopping + " gram.\n");
        System.out.println("Protein i hele kagen: " + (proteinSum+proteinSumTopping) + " gram.\n");

        // Cake calorie outputs
        System.out.println("Cake: ");
        System.out.println("Kalorier fra æg: " + eggCalorieSum + " gram.");
        System.out.println("Kalorier fra sukker: " + sugarCalorieSum + " gram.");
        System.out.println("Kalorier fra mælk: " + milkCalorieSum + " gram.");
        System.out.println("Kalorier fra smør: " + butterCalorieSum + " gram.");
        System.out.println("Kalorier fra hvedemel: " + flourCalorieSum + " gram.");
        System.out.println("Kalorier fra bagepulver: " + bakingSodaCalorieSum + " gram.");
        System.out.println("Kalorier i kagen: " + calorieSum + " gram.\n");

        // Topping calorie outputs
        System.out.println("Topping: ");
        System.out.println("Kalorier i smør: " + calorieButter + " gram.");
        System.out.println("Kalorier i kokosmel: " + coconutCalorieSum + " gram.");
        System.out.println("Kalorier i brun farin: " + brownSugarCalorieSum + " gram.");
        System.out.println("Kalorier i mælk: " + milkCalorieSumTopping + " gram.");
        System.out.println("Kalorier i topping: " + calorieSumTopping + " gram.\n");
        System.out.println("Kalorier i alt: " + calorieSumTopping+calorieSum + " gram.\n");

        // Pris i alt


        // Cake
        System.out.println("Pris for 4 æg: " + eggPrice + " kr.");
        System.out.println("Pris for 300 g sukker: " + sugarPrice + " kr.");
        System.out.println("Pris for 2 dl mælk: " + milkPrice + " kr.");
        System.out.println("Pris for 50g smør: " + butterPrice + " kr.");
        System.out.println("Pris for 250g hvedemel: " + flourPrice + " kr.");
        System.out.println("Pris for 3 tsk bagepulver: " + bakingSodaPrice + " kr.");
        System.out.println("Pris for 1 tsk vaniljesukker: " + vanillaPrice + " kr.");

        //Topping
        System.out.println("Pris for 100g smør: " + butterPriceTopping + " kr.");
        System.out.println("Pris for 150g kokosmel: " + coconutPrice + " kr.");
        System.out.println("Pris for brun farin: " + brownSugarPrice + " kr.");
        System.out.println("Pris for en halv dl mælk: " + milkPriceTopping + " kr.\n");

        System.out.println("Pris i alt: " + everythingPrice + " kr.");


    }
}
