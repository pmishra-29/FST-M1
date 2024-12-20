package activities;

abstract class Book {
	// variable to store the book's title
	String title;

	// Abstract method to set the title
	public abstract void setTitle(String title);

	// concrete method to return the title of the book
	public String getTitle() {
		return this.title;
	}
}

class MyBook extends Book {
	// Implement the setTitle function
	public void setTitle(String title) {
		this.title = title;

	}
}

class MyBook2 extends Book {
	// implement the setTitle function
	public void setTitle(String title) {
		if (title.length() < 3) {
			System.out.println("Title is too small");
		} else {
			this.title = title;
		}
	}
}

public class Activity5 {
	public static void main(String[] args) {
		MyBook bookObj = new MyBook();
		bookObj.setTitle("Twilight Saga");
		System.out.println("The title is : " + bookObj.getTitle());

	}
}
