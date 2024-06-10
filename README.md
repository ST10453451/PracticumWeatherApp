Batsile Riba
ST10453451

https://github.com/ST10453451/PracticumWeatherApp.git

The purpose of my app is to accept user input where the user will be entering temperatures for differnt days of the week: the temperatures will then be stored in arrays. The stored temperatures will be used to calculate the total temperature then the total temperature will be used to calculate the average temperature dividing the total temperature by the total number of days in the week. My application has 3 activities; the splash screen activity, the main activity and the detailed view activity. the purpose of the splash screen is to show the my name, student number and the logo of my app while the main activity and the detailed views activity aim to process the calculating and printing functions.
Below is the pseudocopde showing the logic of my application

Start

  Declarations

    num averagetemp

    num totaltemp

   string weekdays[7]

   num temparatures[7]

   num intcount 

  for intcount = 0 to 6 Step 1
    output (intCount + 1 ) + " - Enter weekday name: "
    input weekdays[intCount]
    output "Enter the temperature for " + weekdays[intCount] + " : "
    input temperatures[intCount]

endfor

  totaltemp= 0

  for intcount = 0 to 6 Step 1

   totaltemp = totaltemp + temperatures[intCount]

  endfor

 averageTemperature= totalTemp/7

 output”The average weekly temperature is:” + averageTemperature

  for intCount 0 to 6 Step 1

    if temperatures[intCount] > 25 then 

      output “Hot” 

   else

     if temperatures[intCount] < 15 then 

     output “Cold”

    else 

    output “Temperate”

     endif

   endif

stop
I also included images showing my code as well as the interface of my app


![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/24e7855f-c335-430b-9029-4033a7582150)


![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/83d03069-606a-40ec-bf19-bace93ac11c7)


![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/a04b8b28-7de9-437d-b3d3-989f3eddcf3c)


![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/f0290984-168e-40ed-a0bb-45be159cfafe)

![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/d3e83647-bcd7-4fec-a8d1-2850d8eedcc4)


![image](https://github.com/ST10453451/PracticumWeatherApp/assets/161457026/2a3aa645-4cf0-47c6-9474-25e79f6a239d)
