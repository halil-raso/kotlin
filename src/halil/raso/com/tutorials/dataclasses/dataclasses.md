Most of classes we defined or used are for storing data purposes.
For those classes are define in general:
1- A constructor. 
2- Fields to store data.
3- getter and setter methods.
4- hashCode(), equals and toString() methods.
Data Class of Kotlin comes in scene and rescue us from doing such boring tasks.
It will useful to think Kotlin data class as Java beans.
General syntax of defining such classes is as following: 
data class Class_name(val/var param1, ...., val/var paramn).
Important Note: If you are only interested in getter, you should define
the corresponding parameter as val not var. 
* If you are interested in getting the first parameters without regarding 
its name, you could use component1() function. This is called destruction.
 
   