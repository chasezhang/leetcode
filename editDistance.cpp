int minDistance(string word1, string word2) {
	int len1 = word1.size() + 1;
	int len2 = word2.size() + 1;

	int **p = new int*[len1];

	for (int i = 0; i < len1; i++) {
		p[i] = new int[len2];
	}

	for (int i = 0; i < len1; i++) {
		p[i][0] = i;
	}

	for (int j = 0; j < len2; j++) {
		p[0][j] = j;
	}

	for (int i = 1; i < len1; i++) {
		for (int j = 1; j < len2; j++) {
			if (word1[i-1] == word2[j-1]) {
				p[i][j] = p[i-1][j-1];
			}
			else {
				p[i][j] = p[i-1][j-1] + 1;
			}
			int m;
			if (p[i-1][j] < p[i][j-1]) {
				m = p[i-1][j];
			}
			else {
				m = p[i][j-1];
			}
			if (m < p[i][j])
				p[i][j] = m;
		}
	}
	return p[len1-1][len2-1];
}
