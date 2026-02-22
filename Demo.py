'''def facto(n):
    if n==1 or n==0:
        return 1
    else:
        return n*facto(n-1)
n=int(input("Enter the value:"))
print("The factorial of the number is:",facto(n))'''
'''def fibonacci(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibonacci(n-1)+fibonacci(n-2)
n=int(input("Enter the number:"))
for i in range(n):
    print(fibonacci(i))'''
'''n=int(input("Enter the number:"))
for i in range(1,6):
    for j in range(i):
        print("*",end=" ")
    print()'''
'''n=int(input("Enter the number:"))
for i in range(1,n+1):
    print(" "*(n-i)+"*"*(2*i-1))
for i in range(n,0,-1):
    print(" "*(n-i)+"*"*(2*i-1))'''
'''s=list(map(str.strip,input("Enter the string").split(",")))
s1=""
s1+=s[0].title()+"|"
s1+=s[1].upper()+"|"
s1+=s[2]+"|"
print(s1)'''
'''import re
text="New features in version V3 and R2 were deployed.minor bug fixes in B1.The stable release is A5,which follows beta version R9,not 3V."
pattern="[A-Z]\d{1}"
m=re.findall(pattern,text)
print(m)'''
'''import numpy as np
sd=np.array([[200,210,250,240],[150,160,140,180],[300,320,310,330],[100,120,110,130],[50,55,60,65]])
s=np.sum(sd,axis=1)
print(s)
m=sd.max()
print(m)
l=sd.size
avg=sd.sum()/l
print(avg)'''
'''def S(n):
    if n==1:
        return 100
    elif n==2:
        return 150
    else:
        return 0.5*S(n-1)+0.3*S(n-2)
n=int(input("Enter the value:"))
print("The stock value is: ",S(n))'''
'''rk=input("Enter the string:")
cs=rk.strip()
print("Clean String:",cs)
i=rk.find("A")
print("the index of the A:",i)
l=rk.split()
print("The list:",l)
lc=rk.lower()
fj=lc.replace(" ","_")
print("The final joined string:",fj)'''
'''l=eval(input("Enter the list of numbers:"))
k=[]
for i in l:
    s=i.split(" ")
    s1=s[1][0]+str(len(s[0]))+s[0][0]
    k.append(s1)
print(k)'''
'''e=input("Enter the email:")
if e.startswith("25"):
    print("starts with 25:True:")
else:
    print("not starts with 25")
if e.endswith("@vitapstudent.ac.in"):
    print("Ends with:true")
else:
    print("False")
if (e[0:9]).isalnum():
    print("True")
else:
    print("false")'''
'''d=input("Enter the time of the day:")
t=input("Enter the traffic density:")
e=input("Enter if the traffic is detected:")
if d=="Peak":
    if t=="High":
        if e=="No":
            print("Traffic light detected: GREEN light duration")
        elif e=="yes":
            print("green light immediate")
        else:
            print("invalid input")
    elif t=="Medium":
        if e=="No":
            print("Traffic light detected: normal duration")
        elif e=="yes":
            print("green light immediate")
        else:
            print("invalid input")
    elif t=="Low":
        if e=="No":
            print("Traffic light detected: reduced light duration")
        elif e=="yes":
            print("green light immediate")
        else:
            print("invalid input")
    else:
        print("Invalid input")
if d=="Off peak":
    print("Green light normal")'''
'''a=int(input("Enter the age:"))
tc=input("Enter your travel class:")
ff=input("Enter if you are a frequent flyer or not:")
d=input("Enter the destination:")
bp=int(input("Enter the base price:"))
bc=int(input("Enter the booking charge:"))
if a<=12:
    if tc=="Economy":
        if ff=="Yes":
            di=bc
            t=bp
elif a>=60:
    if tc=="First":
        if ff=='''
'''import re
sc="STU-23CSE,john.doe@mail.com,+1-5551234567"
p1=r"STU-\d{2}[A-Z]{3}"
m=re.findall(p1,sc)
e=r"[A-Za-z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}"
m1=re.findall(e,sc)
pn=r"\+\d{1}-\d{10}"
m2=re.findall(pn,sc)
print(m)
print(m2)
print(m1)'''
'''n=int(input("Enter the number:"))
rev=0
while n>0:
    dig=n%10
    rev=rev*10+dig
    n=n//10
print(rev)'''
'''a,b=0,1
n=int(input())
if n<=0:
    print("Positive number")
else:
    for i in range(n):
        print(a)
        a,b=b,a+b'''
'''n1=int(input("enter the first number;"))
n2=int(input("Enter the second number"))
while n2!=0:
    n1,n2=n2,n1%n2
print(n1)'''
'''l=[120,140,130,50,30]
o=list(map(int,input("Enter the values").split(",")))
tc=0
for i in o:
    tc+=l[i-1]
print(tc)'''
'''ais=int(input("Enter the average speed:"))
if ais<5:
    print("Plan category:Basic Plan")
    monthlycharge=399
elif ais>=5:
    if ais>=5 and ais<=20:
        print("Plan Category:Standard")
        monthlycharge=699
    elif ais>=21 and ais<=50:
        print("Premium Plan")
        monthlycharge=999
    elif ais>50:
        print("ultra Plan")
        monthlycharge=1499
    else:
        print("Invalid option")
else:
    print("Invalid option")
print(monthlycharge)'''
'''import re
pattern=r"^[A-Za-z][A-Za-z0-9_]*$"
u=input("Enter the username:")
m=re.match(pattern,u)
if m:
    print("Valid username")
    if re.search(r"[A-Z]",u) and re.search(r"[a-z]",u):
        print("yes it starts with lowercase or uppercase character")
    else:
        print("no")
else:
    print("Invalid username")
l=re.findall(r"\d",u)
le=len(l)
print("The total number of digits present is:",le)'''
'''import numpy as np
A=np.random.randint(0,19,size=20)
B=A.reshape(4,5)
print(B)
print(B[1,:])
print(B[:,2])
B[B%2==0]=-1
print(B)'''












        
    






    