import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(100,"Canada","赤");
        Fruits f = new Fruits(100,"Japan","紫");
        System.out.println(apple.price);
        System.out.println(apple.madeIn);
        System.out.println(apple.isMadeInJapan());
        System.out.println(apple.getDetail());
        System.out.println(f.toString());

        Pair<String> p = new Pair<>("test1","test2");
        System.out.println(p);

        Pair2<String,Integer> p2 = new Pair2<>("test3",100);
        System.out.println(p2);


        Pair<String> pair1 = new Pair<>("test1","test2");
        Pair<String> pair2 = new Pair<>("test3","test4");
        Pair<Pair<String>> pairPair = new Pair<>(pair1, pair2);
        Quadruple<String> q = Quadruple.getQuadrupleBy(pairPair);
        System.out.println(q);

        Fruits f1 = new Fruits(199,"japan","red");
        Fruits f2 = new Fruits(199,"japan","blue");

        FruitsPair<Fruits> fp = new FruitsPair<>(f1,apple);
        System.out.println(fp);

        //eqals(ハッシュしないほうが正しい？)
        System.out.println(f1.equals(f2));

        //hash
        HashSet<Fruits> hf1 = new HashSet<>();
        hf1.add(f1);
        HashSet<Fruits> hf2 = new HashSet<>();
        hf2.add(f2);
        System.out.println(hf1.equals(hf2));

//        Food food = new Food();

    }

}