#!/usr/bin/env python3

file = open('input.txt', 'r')

numbers = []

numbers = file.read().splitlines()
numbers.sort()

length = len(numbers)
need = 0


for i in range(int(length/2)):
	num1 = int(numbers[i])
	for j in range(int(length/2), length):
		num2 = int(numbers[j])
		add = num2 + num1

		if add < 2020:
			need = 2020 - add

		for k in range(length):
			num3 = int(numbers[k])

			if num3 == need:
				print("Found numbers: " + str(num1) + ", " + str(num2) + ", " + str(num3))
				print("Multiplication: " + str(num1 * num2 * num3))	
				break