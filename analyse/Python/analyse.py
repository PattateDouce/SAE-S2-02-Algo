import time

resultats = []

for test in range(100):
	start = time.time()

	erase("Cou cou  J M  B")

	end = time.time()

	resusltats.append(end - start)

moy = sum(resultats)/len(resultats)

print("Cela a prit {moy} ms")
