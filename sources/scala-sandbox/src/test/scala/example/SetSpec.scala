package example

import org.scalatest._

// FunSpecをミックインする
// Matchersを利用したスタイルにも対応: http://www.scalatest.org/user_guide/using_matchers
class SetSpec extends FunSpec /* with Matchers */ {
  // describeはテストの解説です。
  // テストクラス内に複数記述できます。
  describe("A Set") {
    // describeは入れ子にできます
    describe("when empty") {
      // テストコードはit内部に記述する
      it("should have size 0") {
        // テストの検証はassertを利用する
        // 引数がfalseのときにテストが失敗します
        // 公式ドキュメント: http://www.scalatest.org/user_guide/using_assertions
        assert(Set.empty.size == 0)
        // Matchersを利用したスタイル
        // Set.empty.size should equal(0)
      }
      it("should produce NoSuchElementException when head is invoked") {
        // 例外が発生することを検証する
        // 例外が発生しない場合にテストが失敗します
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
        // Matchersを利用したスタイル
        // an[NoSuchElementException] should be thrownBy Set.empty.head
      }
    }
  }

}
