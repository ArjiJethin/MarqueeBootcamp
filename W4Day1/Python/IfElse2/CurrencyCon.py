def currency_converter(amount, conversionRate):
    convvertedAmount = amount * conversionRate
    return convvertedAmount

amount = (float)(input())
converseionRate = (float)(input())
convertedAmount = currency_converter(amount, converseionRate)
print(convertedAmount)
