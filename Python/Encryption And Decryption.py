while True:
    key=int(input('Enter ur key: '))
    s=input('Enter ur mssg: ')
    e=''
    for i in s:
        e+=chr(ord(i)+key)
    print(e)



    s=''
    e=e
    key=int(input("Enter ur key: "))
    for i in e:
        s+=chr(ord(i)-key)
    print(s)
