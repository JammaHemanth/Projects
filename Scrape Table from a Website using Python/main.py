import urllib.request
import pandas as pd
url = "https://www.bikewale.com/royalenfield-bikes/"
with urllib.request.urlopen(url) as i:
                    html = i.read()

data = pd.read_html(html)[0]
print(data.head())


"""
Output:    Royal Enfield Bike Model  On-Road Prices
0          Royal Enfield Hunter 350  â¹ 1,49,900 *
1  Royal Enfield Continental GT 650  â¹ 3,18,418 *
2          Royal Enfield Bullet 350  â¹ 1,73,562 *
3         Royal Enfield Classic 350  â¹ 1,93,080 *
4         Royal Enfield Shotgun 650  â¹ 3,59,430 *

"""