import png
import pyqrcode
link = "https://thecleverprogrammer.com/2021/01/14/python-projects-with-source-code/"
qr_code = pyqrcode.create(link)
qr_code.png("instagram.png",scale=5)