package github.nisrulz.sample.learnkotlin

// Get the references for all the views in the layout with a defined ID, via below import.
// This is IMPORTANT to get reference of all views under the exact layout
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    var stringToDisplay = "Hello Kotlin World!"

    /* Static Layout Import
     Kotlin allows you to import all references to views from the layout with one import.

     The TextView from layout is imported as a TextView instance with the name equal to the ID of the view,
     with the name equal to the id in camelCase.

     Note: 1. You don’t need to write semicolons at the end of the lines in Kotlin because they are optional.
           2. When using fragments, make sure imported View references are used after the onCreateView() function call.
              Import the layout in onCreateView() function and use the View references to setup the UI in onViewCreated().
              The references won’t be assigned before the onCreateView() method has finished.
     */
    txt_helloworld.text = stringToDisplay


    // Using the kotlin pojo class
    // More info about properties at https://kotlinlang.org/docs/reference/properties.html

    // Initializing using the primary constructor
    val userName = User("Nishant", "Srivastava")

    // Using contructor to initialize the User object and get value using the custom getter
    stringToDisplay = stringToDisplay + "\n\nUsing primary constructor\n" + "Hello " + userName.fullName

    // Initialize using default setter
     userName.firstName = "Harsh"
     userName.lastName = "Singh"

    stringToDisplay = stringToDisplay + "\n\nUsing default setter\n" + "Hello " + userName.fullName

    // Create the operator class instance and display it in the activity
    var operator = Operator("John", "Doe")
    stringToDisplay = stringToDisplay + "\n\nUsing inheritance\n" + "Hello " + operator.fullName

    // Using member function
    stringToDisplay = stringToDisplay + "\n\nUsing member function of User object\n"  + userName.sayHello("Nishant")

    stringToDisplay = stringToDisplay + "\n\nUsing local member function\n"  + add(5,10)


    // Set the value in textview
    txt_helloworld.text = stringToDisplay

  }

  // Defining a function in kotlin
  fun add(x: Int, y: Int): Int {
    return x + y
  }
}
