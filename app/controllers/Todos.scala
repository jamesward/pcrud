package controllers

object TodoController extends RESTController[Todo] with MongoController[Todo]

case class Todo(id: String, name: String)