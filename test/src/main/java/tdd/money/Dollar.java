package tdd.money;

// Testの記述によって生じたエラーを消す作業
// 1. Dollar クラスの生成 → エラーが一つ消える
// 2. コンストラクタを作る
// 3. times メソッドを作る
// 4. amount フィールドを作る
// -> エラーが消えた!実行
// 5. テスト失敗 テストを通すために、10を入れる -> テスト成功
// 6. 重複を除去（引数の5と2, と10が重複) -> テスト成功

public class Dollar extends Money{
	Dollar(int amount){
		this.amount = amount;  // thisキーワード クラスのフィールドを指す メソッドを呼び出したインスタンスが内部に持っているデータにアクセスする
	}

	// 計算結果をDollarオブジェクトへ格納するために、メソッド返り値を設定
	Dollar times(int multiplier){
		// return null;
		return new Dollar(amount*multiplier);
	}

	// assertEquals -> オーバーライドしたequalsが呼ばれている！
	
	
	// public boolean equals(Object object){
	// 	Dollar dollar = (Dollar) object;   // Dollar型にキャスト
	// 	return amount == dollar.amount;    // 新しく生成したdollarのamountフィールドが元のamountに等しいか
	// }
}



