package tdd.money;

public class Franc extends Money{
	//private int amount;
	Franc(int amount){
		this.amount = amount;  // thisキーワード クラスのフィールドを指す メソッドを呼び出したインスタンスが内部に持っているデータにアクセスする
	}

	// 計算結果をDollarオブジェクトへ格納するために、メソッド返り値を設定
	Franc times(int multiplier){
		// return null;
		return new Franc(amount*multiplier);
	}

	// assertEquals -> オーバーライドしたequalsが呼ばれている！
	//public boolean equals(Object object){
	// 	Money money = (Money) object;
	//	 return amount == money.amount;
	//}
}
