# Number Type Extensions for Kotlin [![](https://jitpack.io/v/pramonow/android-kotlinnumberextensions.svg)](https://jitpack.io/#pramonow/android-kotlinnumberextensions)



Number Extensions for Kotlin

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Dependency

	dependencies {
	        implementation 'com.github.pramonow:android-kotlinnumberextensions:Tag'
	}
  


List of mathemathical formula:

|               | Int        | Long       | Float      | Double    |
| ------------- |:----------:|:----------:|:----------:|----------:|
| Square        |V            |V            |V            |V           |
| Cubic         |V            |V            |V            |V           |
| Power         |V            |V            |V            |V           |
| Absolute      |V            |V            |V            |V           |
| Logarithm     |V            |V            |V            |V           |
| Factorial     |V            |V            |X            |X           |
| PrimeFactors  |V            |V            |X            |X           |
| Fibonacci     |V            |V            |X            |X           |
| IsNegative    |V            |V            |V            |V           |
| IsPositive    |V            |V            |V            |V           |
| IsPrime       |V            |V            |X            |X           |
| Inverse       |X            |X            |V            |V           |
| Round         |X            |X            |V            |V           |

Calling it as simple as

    var integerNumber = 5;
    var powerNumber = integerNumber.square() //25
