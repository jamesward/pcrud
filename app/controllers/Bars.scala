package controllers

object BarController extends RESTController[Bar] with MongoController[Bar]

case class Bar(id: String, name: String, foos: List[Foo])