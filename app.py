import sqlite3

conct = sqlite3.connect('books.db')

cursr = conct.cursor()

cursr.execute('''
CREATE TABLE IF NOT EXISTS books(
          id INTEGER PRIMARY KEY AUTOINCREMENT,
          title TEXT NOT NULL,
          author TEXT NOT NULL,
          year INTEGER,
          bookNumber TEXT)
          ''')

conct.commit()
conct.close()

def connect():
    return sqlite3.connect('books.db')

def createBook(title, author, year, bookNumber):
    conct = connect()
    cursr = conct.cursor()
    cursr.execute("INSERT INTO books(title, author, year, bookNumber) VALUES(?, ? ,?, ?)", 
                         (title, author, year, bookNumber))

    conct.commit()
    conct.close()

def readBooks():
    conct = connect()
    cursr = conct.cursor()
    cursr.execute("SELECT * FROM books")
    books = cursr.fetchall()
    
    conct.close()
    return books

def updateBook(id, title, author, year, bookNumber):
    conct = connect()
    cursr = conct.cursor()
    cursr.execute("UPDATE books SET title = ?, author = ?, year = ?, bookNumber = ? WHERE id = ?",
                  (title, author, year, bookNumber, id))
    
    conct.commit()
    conct.close()

def deleteBook():
    conct = connect()
    cursr = conct.cursor()
    cursr.execute("DELETE FROM books WHERE id = ?", (id))

    conct.commit()
    conct.close()

#ui

def menu():
    while True:

        print("--- Book Database ---")
        print("1. Add book")
        print("2. View books")
        print("3. Update book")
        print("4. Delete book")
        print("5. Exit")
        
        choice = input("Choose an option: ")

        if choice == '1':
            title = input("Title: ")
            author = input("Author: ")
            year = input("Year: ")
            bookNumber = input("International Standard Book Number: ")

            createBook(title, author, year, bookNumber)
            print("Book added successfully!")
        
        elif choice == '2':
            books = readBooks()
            for book in books:
                print(book)
                

        elif choice == '3':
            title = input("Title: ")
            author = input("Author: ")
            year = input("Year: ")
            bookNumber = input("International Standard Book Number: ")

            updateBook(title, author, year, bookNumber)
            print("Book updated successfully! ")

        elif choice == '4':
            id = input("Book ID to be deleted: ")

            deleteBook(id)
            print("Book deleted successfully!")

        elif choice == '5':
            break
        else:
            print("Invalid choice! Try again.")

menu()
