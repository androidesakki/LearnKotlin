package github.nisrulz.sample.learnkotlin

/*
  Note that you have to delegate to the default constructor of the extended class, which is similar to
  calling super() method in the constructor of a new class in Java.
 */
class Operator(val name1: String, val name2: String) : User(name1, name2) {
}