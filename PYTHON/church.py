import sqlite3

conct = sqlite3.connect('church.db')

cursr = conct.cursor()

cursr.execute('''
CREATE TABLE IF NOT EXISTS member(
              MemberID INTEGER PRIMARY KEY NOT NULL
              Name TEXT NOT NULL
              MinistryID INTEGER NOT NULL)''')