class Mobile:
                    def __init__(self,Brand,battery,ram,cam,price):
                            self.Brand = Brand
                            self.battery = battery
                            self.ram = ram
                            self.cam = cam
                            self.price = price
                    def display(self):
                            print("Brand: ",self.Brand)
                            print("Battery: ",self.battery)
                            print("RAM: ", self.ram)
                            print("CAM: ",self.cam)
                            print("Price: ",self.price)
object=Mobile("Apple","4000_MAH","16 GB","48_MP","900000")
object.display()