# textComplexityAnalyzer
Readability scores are used to estimate the ease of study of text, their complexity and categorization.

Text Complexity or readability scoring : Implementation and Analysis
Readability scores are used to estimate the ease of study of text, their complexity and categorisation. There are six standard indexes:
Flesch Reading Ease
•	Polysyllabic words have higher weight then in Flesch Kincaid Index.
•	The higher the value easier to read.
•	Score Notes
    90.0–100.0: easily understood by an average 1 1 -year-old student
    60.0–70.0 :  easily understood by 1 3- to 1 5-year-old students
    0.0–30.0:     best understood by university graduates
•	"The cat sat on the mat.” Scores 116

Flesch Kincaid Index
•	Based on US grade level i.e. gives the years of formal education necessary to read the text
•	Syllable count is required. Hence can’t be easily implemented as optical scanners.

Coleman-Lieu index
•	Based on US grade level i.e. gives the years of formal education necessary to read the text
•	It relies on characters over syllables to judge the complexity of the text.
•	It is simpler to implement as the content of a word do not matter, only their character length. Hence, it can even be implemented with optical scanners 
•	In comparison judges the text more quantitatively than qualitatively compared to other scores.
Gunning Fog Index:
•	Considers frequency of polysyllabic words has higher weightage.
•	Has a minimum value of 0.4
SMOG Index:
•	Based on US grade level i.e. gives the years of formal education necessary to read the text.
•	Developed as a substitute for Gunning-Fog Index
•	It is based on the no. of sentences and polysyllabic words present in the text.
•	Has a minimum value of 3.1291
•	Statistically valid only for text with more than 30 sentences.
	


