/*
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
*/


object Calculate_BMI {
  def bmi(weight: Int, height: Double): String =
    if (weight / (height * height) <= 18.5) "Underweight" else if (weight / (height * height) <= 25) "Normal"
    else if (weight / (height * height) <= 30) "Overweight" else "Obese"
}
