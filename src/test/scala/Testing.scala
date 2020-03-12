import TaxCal.TaxCalculation
import org.scalatest.FlatSpec

class Testing extends FlatSpec {
  "TaxCalculation.tax" should "return a Double" in {
    assert(TaxCalculation.tax(10000).isInstanceOf[Double])

  }
  it should "return 0.00" in {
    assert(TaxCalculation.tax(10000)==0.00)
  }
  it should "return 8697.25" in {
    assert(TaxCalculation.tax(56789)==8697.25)
  }
  it should "return 473326.80" in {
    assert(TaxCalculation.tax(1234567)==473326.80)
  }
  it should "return 200.00" in {
    assert(TaxCalculation.tax(12000)==200.00)
  }
}