import sqlite3

conct = sqlite3.connect()

cursr = conct.cursor()

cursr.execute('''
CREATE TABLE IF NOT EXISTS Student(
              StudentID INTEGER NOT NULL
              FirstName TEXT NOT NULL
              CourseID TEXT
              FOREIGN KEY (CourseID)
              REFERENCES Courses (CourseID))''')


cursr.execute('''
CREATE TABLE IF NOT EXISTS Courses(
              CourseID INTEGER NOT NULL
              )''')

cursr.execute('''
CREATE TABLE IF NOT EXISTS Laptop(
              LaptopID INTEGER NOT NULL
              LaptopName TEXT
              RamCapacity TEXT
              StorageCapacity TEXT)''')

cursr.execute('''
CREATE TABLE IF NOT EXISTS Software(
              )''')