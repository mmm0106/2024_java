public class Apple extends Fruits{
    @Override
    String getDetail(){
        return "これはりんごで生産地は" + this.madeIn + "色:" + this.color;
    }
    Apple(int price,String madeIn,String color){
        super(price,madeIn,color);
    }

}
