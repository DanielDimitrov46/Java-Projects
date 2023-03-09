left = ['goat', 'wolf', 'cabbage']
right = []
number_of_steps = 0
flag_of_wolf = False
flag_of_cabbage = False
choice = input("Choose between wolf and cabbage:")


while left:
    goat = left.pop(0)
    right.append(goat)
    print('Лодка в дясно с коза!')
    print('Лодка в ляво')
    if choice == 'wolf':
        wolf = left.pop(0)
        right.append(wolf)
        flag_of_wolf = True
    elif choice == 'cabbage':
        cabbage = left.pop(1)
        right.append(cabbage)
        flag_of_cabbage = True
    print(f'Лодка в дясно с {choice}!')
    if right[0] == "goat" and right[1] == "wolf" or right[0] == "goat" and right[1] == "cabbage":
        goat = right.pop(0)
        left.append(goat)
        print('Лодка в ляво с коза')
    if left[1] == "goat" and left[0] == "wolf" or left[1] == "goat" and left[0] == 'cabbage':
        if not flag_of_wolf:
            wolf = left.pop(0)
            right.append(wolf)
            print('Лодка с вълк в дясно')
        elif not flag_of_cabbage:
            cabbage = left.pop(0)
            right.append(cabbage)
            print('Лодка със зелка в дясно')
    print('Лодка в ляво')
    goat = left.pop(0)
    right.append(goat)
    print('Лодка с коза в дясно')

    number_of_steps += 1

print('hello world')