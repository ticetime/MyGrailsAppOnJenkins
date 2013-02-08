package mygrailsapp

import grails.plugin.spock.IntegrationSpec


class UserServiceSpec extends IntegrationSpec {

  def userService

  def "user creation"() {

    expect:
    userService.createUser(userName, name, firstName).hasErrors() == creationFailed

    where:
    userName  | name   | firstName | creationFailed
    null      | "toto" | "bob"     |  true
    "toto b." | "toto" | null      |  false
    "bill"    |  null  | null      |  false


  }
}
