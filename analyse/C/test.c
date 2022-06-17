#include <stdio.h>
#include <string.h>

int test() {
	printf("Test de : 666, the number of the beast\n");
	if (strcmp(erase("666, the number of the beast"), "666,thenumberofthebeast") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de : 06   07 65 19 70 \n");
	if (strcmp(erase("06   07 65 19 70 "), "06   07651970") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de : Cou cou  J M  B\n");
	if (strcmp(erase("Cou cou  J M  B"), "Coucou  JM  B") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de : OK\n");
	if (strcmp(erase("OK"), "OK") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de :  un \n");
	if (strcmp(erase(" un "), "un") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de :   deux  \n");
	if (strcmp(erase("  deux  "), "  deux  ") == 0) {
		printf("Test reussi.\n");
	}
	printf("Test de :  . \n");
	if (strcmp(erase(" . "), ".") == 0) {
		printf("Test reussi.\n");
	}

	return 0;
}
