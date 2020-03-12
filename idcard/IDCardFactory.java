package idcard;

import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    // registerProductでは、IDcardのインスタンスを生成することで「製品を作る」ことを現実にしている
    protected Product createProduct(String owner) {
        return new IDcard(owner);
    }

    @Override
    protected void registerProduct(Product product) { // registerProductではIDcardのownerをownersフィールドに追加して、「登録」という機能を実現している
        IDcard idcard = (IDcard) product;
        owners.add(idcard.getOwner());
    }

    public List getOwners() {
        return owners;
    }

}