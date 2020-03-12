package idcard;
import framework.*;

public class IDcard{
    private String owner; //フィールドの作成

    //コンストラクタ
    IDcard(String owner){
        System.out.println(owner + "のカードを使います");
        this.owner = owner;
    }

    public void use(){
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner(){
        return owner;
    }
}