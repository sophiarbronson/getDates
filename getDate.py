#s.bronson 11/7/19

import datetime
import re

#Getting today's date in YYYY-MM-DD
def date():
    d=datetime.datetime.today()

    dstr=str(d)
    date=dstr[0:10]
    year=int(date[0:4])
    month=int(date[5:7])
    day=int(dstr[8:10])
    print(date)

    yesDay(year, month, day)

#Chosen date
def chooseDate():
    year=int(input('Enter the date year (YYYY): '))
    month=int(input('Enter the date month (MM): '))
    day=int(input('Enter the date day (DD): '))

    #YYYY-MM-DD
    stryear=str(year)
    strmonth=str(month)
    strday=str(day)

    if (strmonth=='1' or strmonth=='2' or strmonth=='3' or strmonth=='4' or strmonth=='5' or strmonth=='6' or strmonth=='7' or strmonth=='8' or strmonth=='9'):
        strmonth='0' + strmonth
    if (strday=='1' or strday=='2' or strday=='3' or strday=='4' or strday=='5' or strday=='6' or strday=='7' or strday=='8' or strday=='9'):
        strday='0' + strday

    date=(stryear + '-' + strmonth + '-' + strday)

    print(date)
    yesDay(year, month, day)

#Getting yesterday's date
def yesDay(year, month, day):

    yyear=''
    ymonth=''
    yday=''

    sday=str(day)
    smonth=str(month)
    syear=str(year)

    if (sday=='1'):
        if (smonth=='1'):
            yday=str(31)
            ymonth=str(12)
            yyear=str(year-1)
        elif (smonth=='5' or smonth=='7' or smonth=='10' or smonth=='12'):
            yday=str(30)
            ymonth=str(month-1)
            yyear=str(year)
        elif (smonth=='2' or smonth=='4' or smonth=='6' or smonth=='8' or smonth=='9' or smonth=='11'):
            yday=str(31)
            ymonth=str(month-1)
            yyear=str(year)
        if (year%4 and smonth=='3'):
            yday=str(29)
            ymonth=str(month-1)
            yyear=str(year)
        elif (year/4 and smonth=='3'):
            yday=str(28)
            ymonth=str(month-1)
            yyear=str(year)
    else:
        yday=str(day-1)
        ymonth=str(month)
        yyear=str(year)

    if (yday=='1' or yday=='2' or yday=='3' or yday=='4' or yday=='5' or yday=='6' or yday=='7' or yday=='8' or yday=='9'):
        yday='0' + yday
    if (ymonth=='1' or ymonth=='2' or ymonth=='3' or ymonth=='4' or ymonth=='5' or ymonth=='6' or ymonth=='7' or ymonth=='8' or ymonth=='9'):
        ymonth='0' + ymonth

    ydate=(yyear + '-' + ymonth + '-' + yday)

    print(ydate)

print("Would you like today's date or choose date?\n")
print("1. Today's Date\n")
print("2. Choose Date\n")
option=int(input())

if (option==1):
    date()
elif (option==2):
    chooseDate()
else:
    print("Not an option. Goodbye.")
    exit()
