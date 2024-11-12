from coffee import show_menu
from coffee import coffee_process
import coffee


while True:

    show_menu()    

    menu = input('메뉴선택 : ')

    coffee_process(menu)

    print('잔 액: ', coffee.user_coins)

    if menu == '5':
        break

print('----------프로그램 종료---------------')