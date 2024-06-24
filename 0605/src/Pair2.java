public class Pair2<T,S> {
    public T first;
    public S second;

    public Pair2(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}
