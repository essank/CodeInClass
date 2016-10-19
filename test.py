def triangle(height):
    for line in range(0,height):
        for each in range(0,line+1):
            print("*",end='')

        print()

def square(height):
    for line in range(0,height):
        for each in range(0,height):
            print("* ",end="")
        print()
                      
def rectangle(height,length):
    for line in range(0,length):
        for each in range(0,height):
            print("* ",end="")
        print()



    
choice = input("triangle or square or rectangle?: ")
if choice == "triangle":
    height = int(input("Enter Height: "))
    triangle(height)

elif choice == 'square':
    height = int(input("Enter Height: "))
    square(height)

else:
    length = int(input("Enter Length: "))
    height = int(input("Enter Height: "))
    rectangle(height,length)
