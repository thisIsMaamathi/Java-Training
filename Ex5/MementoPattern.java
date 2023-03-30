package Ex5;

import java.util.Stack;

public class MementoPattern {
	public static void main(String args[]) {
        //creating articleHistory to store the states of the article
		ArticleHistory articleHistory = new ArticleHistory();
		
		//creating and saving articles
		Article a1 = new Article(1, "design pattern", "example content");
		articleHistory.save(a1);
		//setting content and saving article
		a1.setContent("Welcome to the design pattern article");
		articleHistory.save(a1);
	    //setting content not saving article   
		a1.setContent("Today let's learn about Memento design pattern");
        //prints currents state {"Today let's learn about Memento design pattern"}
		System.out.println(a1);

		//prints the previous saved state {"Welcome to the design pattern article"}
		articleHistory.revert(a1);
		System.out.println(a1);
        //prints the previous saved state{1, "design pattern", "example content"}
		articleHistory.revert(a1);
		System.out.println(a1);
        //prints cannot undo as no more previous states exists
		articleHistory.revert(a1);
		System.out.println(a1);
	}
}
//Article class has the functionality of storing,setting ,retrieving saving and reverting of an article
class Article {
	
	private long id;
	private String title;
	private String content;
    //function to set specification of the article
	public Article(long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	//function to set the contents of article
	public void setContent(String content) {
		this.content = content;
	}
    //function to get contents of the article
	public String getContent() {
		return content;
	}
    //function to save the article
	public ArticleMemento save() {
		return new ArticleMemento(getContent());
	}
    //function to undo the changes or go back to a previous state of the article
	public void revert(ArticleMemento state) {
		content = state.getContent();
	}

	@Override
	public String toString() {
		return "Article{" + "id=" + id + ", title='" + title + '\'' + ", content='" + content + '\'' + '}';
	}
}

//this class stores the state of an article 
class ArticleMemento {
	private final String content;
    
	public ArticleMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}

//This class enables the function of saving an article and rolling back to the last saved state
class ArticleHistory {
	//creating stack of type ArticleMemento
	Stack<ArticleMemento> history = new Stack<>();
    //saves that current state of the article
	public void save(Article article) {
		history.push(article.save());
	}
    //undo functionality of the article
	public void revert(Article article) {
		if (!history.isEmpty())
			article.revert(history.pop());
		else
			System.out.println("Cannot undo");

	}
}
