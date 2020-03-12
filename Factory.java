package framework;

public abstract class Factory{

    //createProductで製品を作って、registerProductで登録する
    public final Product create(String owner){
        Product p = createProduct(owner); //製品を作る 抽象メソッドとなる
        registerProduct(p); //登録をする
        return p;
    }
    protected abstract Product createProduct(String owner); 
    protected abstract void registerProduct(Product product);
}