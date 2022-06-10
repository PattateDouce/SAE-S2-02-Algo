# return string without spaces
def erase(str):
	result = ""
	for i in range(len(str)):
		if str[i] == " ":
			if i != 0 and str[i-1] == " ":
				result += str[i];
			elif i+1 < len(str) and str[i+1] == " ":
				result += str[i]
		else:
			result += str[i]
	return result
