import requests
url = "https://plus.unsplash.com/premium_photo-1707227215622-749aade95286?q=80&w=2069&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
try:
        with open("file.jpg","wb") as f:
                    f.write(requests.get(url).content)
                    print("Loaded Sucessfully...........")
except:
        print("Error occured while loading")                    