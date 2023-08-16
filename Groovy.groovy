println "Hello, World!"


class HelloTest {
    public HelloTest() {
        println "Hello, World!"
    }
    public static void main(String[] args) {
        new HelloTest()
    }
}

switch (value) {
case "Hello": 
   println "value == 'Hello'"
   break
case String: 
   println "valueはString型"
   break
case 1..12: 
   println "valueは1～12の間"
   break
default:
   println "それ以外"
}
for (int i = 0; i < 3; i++) { println "$i: Hello" }
for (i in 1..3) { println "$i: Hello" }
(1..3).each { println "$it: Hello" }
3.times { println "$it: Hello" }

class Pojo {
    def name
}
def pojo = new Pojo(name:"名前")
println pojo.getName() // getName()が生成されている
println pojo.name // getName()が呼ばれる

def greet(mess = "Hello World") {
    println mess
}
greet()
greet("foo")

def obj = "foo"
obj.metaClass.greet = { println "Hello World" }
obj.greet()

import groovy.inspect.Inspector

use (Category.class) {
    def obj = "Hoge"
    println obj.getShortClassName()
    println obj.toString()
}

//名前は自由
class Category {
    //最初の引数は、メソッドが起動されたインスタンスの参照コピー
    static getShortClassName(obj) {
        Inspector.shortName(obj.getClass())
    }
    //実装メソッドと重複する場合、Groovyはカテゴリーより実装メソッドを優先
    static String toString(Object obj) {
        "Hello World"
    }
}
