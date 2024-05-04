rows = int(input("Enter a number: "))
for i in range(1,rows):
                    for j in range(i,0,-1):
                            print(j, end=" ")
                    print(" ")   

"""

Output:
Enter a number: 6
1          
2 1        
3 2 1      
4 3 2 1    
5 4 3 2 1  

"""                         