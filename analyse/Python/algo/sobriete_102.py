# return string without spaces
import re
def erase(cc):
	return re.sub("(?<!\s)\s(?!\s)",'',cc)
