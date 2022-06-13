def erase (chaine) :
	res = ""
	var = ""
	cpt = 0
	for i in range (len(chaine)) :
		if chaine [i] == " " :
			var += " "
			cpt += 1
			pass
		else :
			if cpt > 1 :
				res += var
			cpt = 0
			var = ""
			res += chaine [i]
	if cpt > 1:
		res += var
	return res
