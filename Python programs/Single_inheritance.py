#Single Inheritance
class Parent:
                    def fun1(self):
                            print("This is Parent Class")
class child(Parent):
        def fun2(self):
                print("This is Child class")
obj = child()
obj.fun2()
obj.fun1()
print()


#Multi-level Inheritance
class Parent:
                    def fun1(self):
                            print("This is Parent Class")
class child(Parent):
        def fun2(self):
                print("This is Child_Class")
class Grandchild(child):
        def fun3(self):
                print("This is Grand_Child Class")
obj = Grandchild()
obj.fun1() 
obj.fun2()
obj.fun3()
print()    

#hierarical inheritance
class Parent:
                    def fun1(self):
                            print("This is Parent class")
class child1(Parent):
        def fun2(self):
                print("This is Child_1 class") 
class child2(Parent):
        def fun3(self):
                print("This is child_2 class")
obj = child2()
obj.fun1()
#obj.fun2() //This is not applicable because it has 2 child class child_2 will access directly to the parent class
obj.fun3()  
print()  

#Multiple Inheritance
class Father:
                    def fun1(self):
                            print("This is Father class")
class Mother:
        def fun2(self):
                print("This is Mother Class")
class child(Father,Mother):
        def fun3(self):
                print("This is Child Class") 
obj = child()
obj.fun3()
obj.fun2()
obj.fun1()
print()


"""

Output:
#Single Inheritance
This is Child class
This is Parent Class

#Multi-level Inheritance
This is Parent Class
This is Child_Class
This is Grand_Child Class

#hierarical inheritance
This is Parent class
This is child_2 class

#Multiple Inheritance
This is Child Class
This is Mother Class
This is Father class


"""