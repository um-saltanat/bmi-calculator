# BMI_Calculator
A BMI Calculator application using Java and JavaFX that allows users to calculate their Body Mass Index (BMI) and provides information on their BMI status according to the Department of Health and Human Services/National Institutes of Health guidelines. It contains three files:

# (Main) Application class
The class responsible for launching the application and loading your FXML.
![Снимок экрана (26)](https://github.com/um-saltanat/bmi-calculator/assets/145360854/a5614c4e-20ea-43d5-bf1f-52a29556ca0b)


# FXML file
Responsible for what the application displays.

# Controller class
FXML and java code adapter. The class that is a layer between the java code and the FXML file. All fx:id links are connected through it, calls to interactive interface elements are processed in its methods, and initialization occurs immediately.

The user types in his/her height and weight in metrics, and the program calculates BMI based on those inputs and then displays BMI status (Underweight, Normal, Overweight, Obese) based on the calculated BMI.
