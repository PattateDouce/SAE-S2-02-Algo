import time
import algo.sobriete_102 as sob
import algo.efficacite_13 as eff

def analyse(fonction):
	resultats = []

	with open('../texte 100k not erased.txt') as f:
		input = f.read()

	with open('../texte 100k erased.txt') as f:
		output = f.read()

	for test in range(100):
		start = time.time()

		erased = fonction(input)

		if erased != output:
			print('Le résultat n\'est pas correct')

		end = time.time()

		resultats.append(end - start)

	moy = sum(resultats)/len(resultats)

	print(f"Cela a prit {sum(resultats)} s, avec une moyenne de {moy*1000} ms")

print('Analyse de sobriete_102')
analyse(sob.erase)

print('\nAnalyse de sobriete_102')
analyse(eff.erase)
