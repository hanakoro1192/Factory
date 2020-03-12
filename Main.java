import framework.*;
import idcard.*;
//2つのパッケージをインポートしている

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("くまさん");
        Product card2 = factory.create("うんこ");
        Product card3 = factory.create("パーマン");
        card1.use();
        card2.use();
        card3.use();
    }
}