class Vehcile:
                    def __init__(self,name,company):
                            self.name = name
                            self.company = company

                    def printname(self):
                            print(self.name,self.company)        

x = Vehcile("BMW","X-150")                            
x.printname()