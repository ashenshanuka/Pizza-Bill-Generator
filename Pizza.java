public class Pizza {

    private int price;
    private Boolean veg;
    private int ExtraCheese=150;
    private int ExtraTopping=200;
    private int Takeaway=20;
    private int basepizza;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basepizza = this.price;
    }



    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeawayAdded = false;

    public void ExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += ExtraCheese;
    }

    public void ExtraTopping() {
       isExtraToppingAdded = true;
        this.price += ExtraTopping;
    }

    public void Takeaway() {
        isTakeawayAdded = true;
        this.price += Takeaway;
    }

    public void getBill() {
        String bill="";
        System.out.println("Pizza " + basepizza);

         if (isExtraCheeseAdded) {

             bill+="ExtraCheese Added "+ExtraCheese+"\n";
         }
         if (isExtraToppingAdded) {

             bill+="ExtraTopping Added "+ExtraTopping+"\n";
         }
         if (isTakeawayAdded) {

             bill+="Takeaway Added "+Takeaway+"\n";
         }
         bill+= "Bill:"+this.price +"\n";
         System.out.println(bill);
    }
}
