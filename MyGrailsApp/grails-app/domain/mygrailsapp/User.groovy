package mygrailsapp

class User {

  String userName
  String name
  String firstName

  static constraints = {
    userName blank: false
    name nullable: true
    firstName nullable: true
  }
}
