def do_this():
    print("Doing this")

def do_that():
    print("Doint that")

match input("Doing this or that?"):
    case 'this':
        do_this()
    case 'that':
        do_that()
    case _:
        print("Invalid input!")