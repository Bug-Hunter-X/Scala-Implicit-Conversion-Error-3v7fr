```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object Main {
  implicit val stringToInt: String => Int = s => s.toInt
  def main(args: Array[String]): Unit = {
    val instance = new MyClass[String]("123")
    val result = instance.myMethod
    println(result) // Output: 123
  }
}
```