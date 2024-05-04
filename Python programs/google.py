"""
from googlesearch import search

query = "electronic commerce 11th edition by gary schneide free pdf download "

for i in search(query, start =  0, stop= 100, pause=2.0):
                    print("\n",i)                    

"""
import requests
from bs4 import BeautifulSoup

def download_pdf_from_url(url, filename):
  """
  Downloads a PDF from a URL and saves it with the given filename.

  Args:
      url: The URL of the webpage containing the PDF link.
      filename: The filename to save the downloaded PDF.
  """

  # Get the webpage content
  response = requests.get(url)

  # Parse the HTML content
  soup = BeautifulSoup(response.content, 'html.parser')

  # Find the PDF link (replace 'a' with the appropriate tag if needed)
  pdf_link = soup.find('a', href=lambda href: href and href.endswith('.pdf'))

  if pdf_link:
    # Extract the PDF URL
    pdf_url = pdf_link['href']

    # Download the PDF content
    pdf_response = requests.get(pdf_url, stream=True)

    # Check for successful download
    if pdf_response.status_code == 200:
      with open(filename, 'wb') as f:
        for chunk in pdf_response.iter_content(1024):
          f.write(chunk)
      print(f"PDF downloaded successfully: {filename}")
    else:
      print(f"Error downloading PDF: {pdf_url}")
  else:
    print(f"PDF link not found on the webpage: {url}")

# Example usage
url = input("Enter the file link: ")  # Replace with the actual URL
filename = "downloaded_report.pdf"
download_pdf_from_url(url, filename)

