package tdd.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MoneyTest {
	@Test
	public void testMultipilication(){
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product);
		product = five.times(3);
		assertEquals(10, product);
	}
}

// 第1章
// 1. コンパイルすら通らない！エラー内容：(1) Dollar クラスがない (2) コンストラクタがない (3) timesメソッドがない (4) amountフィールドがない
// 2. Dollar.javaへエラーを消すために最小限の実装を行う。エラーが消えていることを確認してテスト実行→テスト失敗
// 3. テストを通すために最小限の変更(amountに10を代入)→テストが通った!
// 4. 重複の除去　引数の5と2をメソッド内で再度10と定義している→これを解消したい

// 第2章
// Dollarオブジェクトの状態が変化してしまう