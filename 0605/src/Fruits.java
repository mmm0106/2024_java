public class Fruits {
    int price;
    String madeIn;
    String color;

    Fruits(int price,String madeIn,String color){
        this.price=price;
        this.madeIn=madeIn;
        this.color=color;
    }
    int getPrice(){
        return this.price;
    }
    String getMadeIn(){
        return this.madeIn;
    }
    String getColor(){
        return this.color;
    }

    String getDetail(){
        return "生産地" + this.madeIn + "色:" + this.color;
    }




    boolean isMadeInJapan() {
        if(this.madeIn.equals("Japan")){
            return true;
        }else{
            return  false;
        }
    }
    @Override
    public String toString(){
        return "果物の値段は"+this.price+"円です。";
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Fruits == false) {
            return false;
        }
        if (this.price == ((Fruits) o).price) {
            return true;
        }
        return false;
    }

}

