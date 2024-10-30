coffee_menu = """
        1. 밀크커피(300원)

        2. 설탕커피(300원)

        3. 블랙커피(200원)

        4. 동전입력

        5. 종료
"""

user_coins = 0  # 사용자가 입력한 동전
vm_coins = 0 # 자판기가 판매한 동전

while True:

    print(coffee_menu)

    menu = input('메뉴선택 : ')

    if menu == '1':
        print('밀크커피 선택')
        if user_coins >= 300:
            print('밀크커피 나왔습니다.')
            user_coins -= 300
            vm_coins += 300
    elif menu == '2':
        print('설탕커피 선택')
        if user_coins >= 300:
            print('설탕커피 나왔습니다.')
            user_coins -= 300
            vm_coins += 300
    elif menu == '3':
        print('블랙커피 선택')
        if user_coins >= 200:
            print('블랙커피 나왔습니다.')
            user_coins -= 200
            vm_coins += 200
            
    elif menu == '4':
        print('동전입력')
        user_coins = int(input('메뉴에 알맞은 동전입력 : '))
    elif menu == '5':    
        print('종료')
        break
    else:
        print('잘못입력')

    print('입력한 동전: ', user_coins)

print('----------프로그램 종료---------------')




