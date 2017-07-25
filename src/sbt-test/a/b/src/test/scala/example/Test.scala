package example

class Test extends org.scalatest.FunSpec {
  describe("a") {
    it("b") {
      Thread.sleep(2000)
      assert(true)
    }
  }
}
