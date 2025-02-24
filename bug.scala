```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: T => Int): Int = ev(value)
}

object Main {
  def main(args: Array[String]): Unit = {
    val instance = new MyClass[String]("123")
    // This will not compile due to implicit conversion not found
    val result = instance.myMethod 
  }
}