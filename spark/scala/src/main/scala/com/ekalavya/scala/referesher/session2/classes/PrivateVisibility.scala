/**
 * Created by mageswaran on 10/11/15.
 */

package scopeA {
class PrivateClass1(private val privateField1: Int) {
  private val privateField2 = 1
}
class PrivateClass2 extends PrivateClass1(1) {
//  val field1 = privateField1 // ERROR
//  val field2 = privateField2 // ERROR
//  val nField = new Nested().nestedField // ERROR
}
class PrivateClass3 {
  val privateClass1 = new PrivateClass1(1)
//  val privateField1 = privateClass1.privateField1 // ERROR
//  val privateField2 = privateClass1.privateField2 // ERROR
//  val privateNField = privateClass1.nested.nestedField // ERROR
}
private class PrivateClass4

//class PrivateClass5 extends PrivateClass4 // ERROR

//protected class PrivateClass6 extends PrivateClass4 // ERROR

private class PrivateClass7 extends PrivateClass4
}
package scopeB {
//class PrivateClass4B extends scopeA.PrivateClass4 // ERROR
}


object PrivateVisibility extends App{

}
