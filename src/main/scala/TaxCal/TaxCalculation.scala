package TaxCal

object TaxCalculation extends App{
 def input():Unit ={

   tax(scala.io.StdIn.readLine("Enter your income:").toInt)
 }


  def tax(salary:Int): Double={
    salary match {
      case a if a<=10000=> println("income tax: 0.00")
        0.00
      case b if b>10000 && b<=30000=>
        val incomeTax =0.1*(b-10000)
        println(f"the income tax is: $incomeTax%.2f")
//        val incrate= incomeTax/salary
//        val str= f"$incrate%.2f"
//        overall(str.toFloat)
        incomeTax
      case c if c>30000 && c<=100000 => val taxEq = (0.25*(c-30000))+2000
        println(f"the income tax is: $taxEq%.2f")
        taxEq
      case _ => val taxCal = 0.4*(salary-100000)+2000+17500
        println(f"the income tax is: $taxCal%.2f")
        taxCal
    }

  }
//  def overall(fl: Float): Int={
//    fl match{
//      case a if a<=10000=> println("income tax: 0.00")
////        0.00
////    }
//  }
  input()
}
