import speedtest
wifi = speedtest.Speedtest()
print("Wifi download speed: ", wifi.download())
print("Wifi upload speed: ", wifi.upload())
