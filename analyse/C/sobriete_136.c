char* erase(char* chaine) {

	unsigned int size = 0;
	while(*(chaine+size)) ++size;

	char* result = (char*) malloc(size);
	int new_size = 0;

	for (int i = 0 ; i < size ; ++i) {
		char car = chaine[i];
		// On a trouvé un espace
		if (car == 32) {
			int cpt = 1;
			while(i+cpt < size && chaine[i+cpt] == 32) {
				result[new_size] = ' ';
				++cpt;
				++new_size;
			}

			if(cpt != 1) {
				result[new_size] = ' ';
				++new_size;
				i+=cpt-1;
			}
		}

		else {
			result[new_size] = chaine[i];
			++new_size;
		}

	}

	return result;
  }
