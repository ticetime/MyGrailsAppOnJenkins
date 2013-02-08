package mygrailsapp

class UserService {

  /**
   * Create a user and persists him
   * @param userName
   * @param name
   * @param firstName
   * @return the user
   */
  User createUser(String userName, String name = null, String firstName = null) {
    User user = new User(userName: userName, name: name, firstName: firstName)
    user.save()
    user
  }
}
