package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory{
    private IDcard owner;

    private List owners = new ArrayList();
    //registerProductでは、IDcardのインスタンスを生成することで「製品を作る」ことを現実にしている
    protected Product createProduct(String owner){
        return new IDcard(owner);
    }
    protected void registerPriduct(Product product){ //registerProductではIDcardのownerをownersフィールドに追加して、「登録」という機能を実現している
        owners.add((IDcard)product.getOwner());
    }
    public List getOwners(){
        return owners;
    }
}