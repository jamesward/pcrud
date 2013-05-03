package controllers

object FooController extends RESTController[Foo] with SlickController[Foo]

case class Foo(id: String, name: String)