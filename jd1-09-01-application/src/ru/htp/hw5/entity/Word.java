package ru.htp.hw5.entity;

// 1. Создать объект класса Текст, используя классы Предложение, Слово. 
// Методы: дополнить текст, вывести на консоль текст, заголовок текста. 

public class Word {

	private String word;

	public Word(String word) {
		this.word = word;
	}
	

	@Override
	public String toString() {
		return word;
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}
