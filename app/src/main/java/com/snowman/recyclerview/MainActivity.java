package com.snowman.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();

        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza,"Pizza","Make your own pizza with a crispy base, mozzarella cheese and a fresh tomato sauce. Add simple toppings like slices of ham and rocket if you like.","https://www.bbcgoodfood.com/recipes/pizza"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.kids_pizza,"Toddler recipe: homemade pizza with veggie faces","Here’s a toddler recipe to keep little bellies full and hands busy. They can decorate these pizzas themselves and pack in four of their five-a-day.","https://www.bbcgoodfood.com/recipes/toddler-recipe-easy-homemade-pizza-veggie-faces"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.rainbow_pizzas,"Rainbow pizzas","Forget takeaway pizzas, encourage kids to eat a rainbow every day with this colourful recipe full of fresh flavours – guaranteed to please even fussy eaters.","https://www.bbcgoodfood.com/recipes/rainbow-pizzas"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.christmas_pizza,"Christmas pizza","Use up leftover roast turkey and sausagemeat stuffing in this new spin on an Italian classic","https://www.bbcgoodfood.com/recipes/christmas-pizza"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pitta_pizzas,"Pitta pizzas","Little ones will love these fun and super-easy pizza's for lunch or a light supper","https://www.bbcgoodfood.com/recipes/pitta-pizzas-0"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza_rolls,"Pizza rolls","These easy-to-make snacks can be doubled to feed a crowd of kids","https://www.bbcgoodfood.com/recipes/pizza-rolls"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.sourdough_pizza,"Sourdough pizza","Make homemade sourdough pizza with a wonderfully chewy crust. Try our margherita recipe, then customise with your favourite toppings","https://www.bbcgoodfood.com/recipes/sourdough-pizza"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.no_yeast_pizza_dough,"No yeast pizza dough","Try this easy no yeast recipe for pizza dough using just flour, baking powder, salt and oil. Recipe by Helen Hurrell, mum of BBC Good Food member Eleanor","https://www.bbcgoodfood.com/recipes/no-yeast-pizza-dough"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.easy_tomato_pizzas,"Easy tomato pizzas","These colourful, flavour-packed pizzas are low-fat and delicious too","https://www.bbcgoodfood.com/recipes/easy-tomato-pizzas"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ham_ricotta_pizzas,"Ham & ricotta pizzas with pesto","This colourful, flavour-packed pizza is a great storecupboard supper with only five ingredients","https://www.bbcgoodfood.com/recipes/ham-ricotta-pizzas-pesto"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pepperoni_pizza_pie,"Pepperoni pizza pie","Use a ready-made bread mix to make this homemade calzone-style pizza filled with cheese, tomato, pepperoni and peppers","https://www.bbcgoodfood.com/recipes/pizza-pie"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.frying_pan_pizza_pie,"Frying pan pizza pie","A pizza and pie in one to make a delicious lunchtime treat or daytime snack","https://www.bbcgoodfood.com/recipes/frying-pan-pizza-pie"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.quick_pitta_pizzas,"Quick pitta pizzas","Kids will love this quick supper. Experiment with different toppings such as sweetcorn and ham","https://www.bbcgoodfood.com/recipes/pitta-pizzas"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.puff_pizza_tart,"Puff pizza tart","This tart requires just four main ingredients and can be assembled in minutes, without a knife or chopping board in sight","https://www.bbcgoodfood.com/recipes/puff-pizza-tart"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.cheesy_courgette_pizza,"Cheesy courgette pizza","Kids will love having this pizza for supper, and they'll enjoy making it too, with our specially designed recipe for children aged 5-9","https://www.bbcgoodfood.com/recipes/cheesy-courgette-pizza"));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems);
        layoutManager = new LinearLayoutManager(this);
       // GridLayoutManager layoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}