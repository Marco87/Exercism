def convert(number):
    factor = ""
    
    if(number % 3 == 0):
        factor += "Pling"
    if(number % 5 == 0):
        factor += "Plang"
    if(number % 7 == 0):
        factor += "Plong"
    if(factor == ""):
        factor = str(number)

    return factor