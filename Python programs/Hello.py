print(
        "Hello world"
        )

import sqlite3

# Function to create a new database and table if they don't exist
def create_database():
    conn = sqlite3.connect('library.db')
    c = conn.cursor()
    c.execute('''CREATE TABLE IF NOT EXISTS books
                 (id INTEGER PRIMARY KEY AUTOINCREMENT,
                 title TEXT,
                 author TEXT,
                 year INTEGER)''')
    conn.commit()
    conn.close()

# Function to add a new book to the database
def add_book(title, author, year):
    conn = sqlite3.connect('library.db')
    c = conn.cursor()
    c.execute("INSERT INTO books (title, author, year) VALUES (?, ?, ?)", (title, author, year))
    conn.commit()
    conn.close()

# Function to update an existing book in the database
def update_book(id, title, author, year):
    conn = sqlite3.connect('library.db')
    c = conn.cursor()
    c.execute("UPDATE books SET title=?, author=?, year=? WHERE id=?", (title, author, year, id))
    conn.commit()
    conn.close()

# Function to delete a book from the database
def delete_book(id):
    conn = sqlite3.connect('library.db')
    c = conn.cursor()
    c.execute("DELETE FROM books WHERE id=?", (id,))
    conn.commit()
    conn.close()

# Function to display all books in the database
def show_books():
    conn = sqlite3.connect('library.db')
    c = conn.cursor()
    c.execute("SELECT * FROM books")
    books = c.fetchall()
    conn.close()
    return books

# Create the database and table if they don't exist
create_database()

# Main program loop
while True:
    print("\nLibrary Management System")
    print("1. Add a new book")
    print("2. Update a book")
    print("3. Delete a book")
    print("4. Show all books")
    print("0. Exit")

    choice = input("Enter your choice: ")

    if choice == '1':
        title = input("Enter book title: ")
        author = input("Enter book author: ")
        year = input("Enter publication year: ")
        add_book(title, author, year)
        print("Book added successfully.")

    elif choice == '2':
        id = input("Enter book ID to update: ")
        title = input("Enter new title (leave blank to keep unchanged): ")
        author = input("Enter new author (leave blank to keep unchanged): ")
        year = input("Enter new year (leave blank to keep unchanged): ")
        update_book(id, title, author, year)
        print("Book updated successfully.")

    elif choice == '3':
        id = input("Enter book ID to delete: ")
        delete_book(id)
        print("Book deleted successfully.")

    elif choice == '4':
        books = show_books()
        if books:
            print("\nBooks in the library:")
            for book in books:
                print(f"ID: {book[0]}, Title: {book[1]}, Author: {book[2]}, Year: {book[3]}")
        else:
            print("No books in the library.")

    elif choice == '0':
        print("Exiting program. Goodbye!")
        break

    else:
        print("Invalid choice. Please try again.")
