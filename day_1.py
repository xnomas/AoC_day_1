#!/usr/bin/env python3

file = open('input.txt', 'r')

numbers = []

numbers = file.read().splitlines()
numbers.sort()

length = len(numbers)

for i in range(int(length/2)):
	for j in range(int(length/2), length):
		if int(numbers[i]) + int(numbers[j]) == 2020:
			print("Found numbers: " + numbers[i] + ", " + numbers[j])
			print("Multiplication: " + str(int(numbers[i]) * int(numbers[j])))

