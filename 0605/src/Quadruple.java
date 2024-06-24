public class Quadruple<T> {
    public T first;
    public T  second;
    public T third;
    public T  fourth;

    public Quadruple(T first,T second,T third,T fourth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
    public static <T> Quadruple<T> getQuadrupleBy(Pair<Pair<T>> pairPair) {
        return new Quadruple<T>(
                pairPair.first.first,
                pairPair.first.second,
                pairPair.second.first,
                pairPair.second.second
        );
    }

//    @Override
//    public boolean equals(Object o){
//        if (o==null){return false;}
//        if (o instanceof Quadruple == false){return false;}
//        if(this.second == ((Quadruple)o).first){return true;}
//        return false;
//    }

}
