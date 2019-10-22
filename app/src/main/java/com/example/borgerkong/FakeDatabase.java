package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Burger getBurgerById (int burgerID) {
        return burgers.get(burgerID);
    }

    public static ArrayList<Burger> getAllBurgers() {
        return new ArrayList<Burger>((List) Arrays.asList(burgers.values().toArray()));
    }

    private static final HashMap<Integer, Burger> burgers = new HashMap<>();

    static {
        burgers.put(1, new Burger(
                1,
                "Single Pretzel Bacon King",
                "Our Single PRETZEL BACON KING™ Sandwich features one ¼ lb. of savory flame-grilled 100% beef patties, topped with smoky bacon, melted American cheese, tangy mustard and creamy mayonnaise all on a toasted pretzel bun.",
                12,
                "920 Cal"

        ));

        burgers.put(2, new Burger(
                2,
                "Double Pretzel Bacon King",
                "Our Double PRETZEL BACON KING™ Sandwich features two ¼ lb.* of savory flame-grilled 100% beef patties, topped with smoky bacon, melted American cheese, tangy mustard and creamy mayonnaise all on a toasted pretzel bun.",
                14,
                "1240 Cal"
        ));

        burgers.put(3, new Burger(
                3,
                "Impossible Whopper",
                "Our Impossible™ WHOPPER® Sandwich features a savory flame-grilled patty made from plants topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun. 100% WHOPPER®, 0% Beef.",
                14,
                "630 Cal"

        ));

        burgers.put(4, new Burger(
                4,
                "Single Stacker King",
                "Our Single STACKER KING™ Sandwich features more than ¼ lb. of savory flame-grilled 100% beef, topped with smoky bacon, melted American cheese and our special Stacker sauce all on a toasted sesame bun.",
                16,
                "700 Cal"

        ));

        burgers.put(5, new Burger(
                5,
                "Double Stacker King",
                "Our Double STACKER KING™ Sandwich features more than ½ lb. of savory flame-grilled 100% beef, topped with smoky bacon, melted American cheese and our special Stacker sauce all on a toasted sesame bun.",
                16,
                "1050 Cal"

        ));

        burgers.put(6, new Burger(
                6,
                "Double Quarter Pound King",
                "Our Double Quarter Pound KING™ Sandwich has over ½ lb.* of flame-grilled 100% beef, topped with all of our classic favorites: American cheese, freshly sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame seed bun.",
                16,
                "900 Cal"

        ));

        burgers.put(7, new Burger(
                7,
                "Bacon King Jr",
                "Introducing the BACON KING™ Jr. Sandwich, smaller package, same BIG taste. Two flame–grilled 100% beef patties topped with thick-cut smoked bacon, melted American cheese, ketchup and creamy mayonnaise on a toasted sesame seed bun.",
                12,
                "570 Cal"

        ));

        burgers.put(8, new Burger(
                8,
                "Grilled Chicken Caesar Sandwich",
                "Our New Grilled Chicken Caesar Sandwich is made with 100% white meat seasoned chicken filet carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, bacon, and shaved parmesan cheese all on a potato bun.",
                13,
                "710 Cal"

        ));

        burgers.put(9, new Burger(
                9,
                "Crispy chicken Caesar Sandwich",
                "Our New Crispy Chicken Caesar Sandwich is made with 100% white meat seasoned chicken filet, battered and breaded, and carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, bacon, and shaved parmesan cheese all on a potato bun.",
                12,
                "810 Cal"

        ));

        burgers.put(10, new Burger(
                10,
                "Spicy Crispy Chicken",
                "Introducing the Spicy Crispy Chicken Sandwich made with juicy, tender and crispy 100% white meat chicken, seasoned and breaded with bold flavors and just the right amount of heat; topped with fresh lettuce, a ripe tomato, and creamy mayonnaise all on a potato bun.",
                12,
                "700 Cal"

        ));

        burgers.put(11, new Burger(
                11,
                "Original Chicken",
                "Our Original Chicken Sandwich is made with white meat chicken, lightly breaded and topped with a simple combination of shredded lettuce and creamy mayonnaise on a sesame seed bun.",
                11,
                "660 Cal"

        ));

        burgers.put(12, new Burger(
                12,
                "Garden Side Salad",
                "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. Nutrition Information does not reflect home-style croutons or KEN’S salad dressing.",
                8,
                "60 Cal"

        ));

        burgers.put(13, new Burger(
                13,
                "Chicken Nuggets",
                "Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.",
                10,
                "170 Cal"
        ));

        burgers.put(14, new Burger(
                14,
                "French Fries",
                "More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.",
                4,
                "380 Cal"
        ));

        burgers.put(15, new Burger(
                15,
                "Hash Browns",
                "Make your morning sizzle with a small side of our signature crunchy, golden Hash Browns. Nutrition information reflects medium size.",
                6,
                "250 Cal"
        ));

        burgers.put(16, new Burger(
                16,
                "Chocolate Chip Cookie",
                "Our delicious Chocolate Chip Cookie is loaded with melty chocolate chips and baked to perfection.",
                5,
                "160 Cal"
        ));

        burgers.put(17, new Burger(
                17,
                "BK Cafe Caramel Frappe",
                "Our BK® Café Frappes start with 100% Arabica bean coffee, blended until smooth and creamy with Caramel flavor and topped with fluffy, whipped cream for a deliciously cool frappe experience.",
                5,
                "500 Cal"
        ));

    }
}

