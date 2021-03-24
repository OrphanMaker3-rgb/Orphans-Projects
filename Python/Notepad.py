import time

# Global Variables
note1 = ("")
note2 = ("")

# Y/N's
yn1 = 1
viewN1 = 0
viewN2 = 1

# Start page
print("Welcome to notepad")
print("Tip: Remember that you can make up to two note's")
print("loading...")
time.sleep(0.8)

# New Note
print("Would you like to make a new note?")
time.sleep(0.4)
yn1 = int(input("Press 1 for yes, press 2 for no: "))

# If the first new note
if yn1 == 1:
    print("Loading new note...")
    time.sleep(0.7)
    print("tip")
    note1 = input("Write new note here: ")
    note2 = input("Write the second note here: ")
    whichN = input("Which note would you like to view? press 0  for note one press 1 for note 2: ")
    if viewN1  >1:
        print(note1)
    if viewN2 >0:
        print(note2)
# If No Want to Take Note
if yn1 >1:
    print("Ok, Goodbye")