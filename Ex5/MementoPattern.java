package Ex5;
import java.util.Stack;

public class MementoPattern {
	public static void main(String args[]) {
	ArticleHistory articleHistory =new ArticleHistory();
    Article a1 =new Article(1,"design pattern","example content");
    articleHistory.save(a1);
    System.out.println(a1);
    
    a1.setContent("Welcome to the design pattern article");
    articleHistory.save(a1);
    System.out.println(a1);

    a1.setContent("Today let's learn about Memento design pattern");
    articleHistory.save(a1);
    System.out.println(a1);

    articleHistory.revert(a1);
    System.out.println(a1);

    articleHistory.revert(a1);
    System.out.println(a1);

    articleHistory.revert(a1);
    System.out.println(a1);
	}
}

class Article {
    private long id;
    private String title;
    private String content;

    public Article(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public ArticleMemento save() {
        return new ArticleMemento(getContent());
    }

    public void revert(ArticleMemento state) {
        content = state.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

class ArticleMemento {

    private final String content;

    public ArticleMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}




//CareTaker class
class ArticleHistory {
  Stack<ArticleMemento> history = new Stack<>();

  public void save(Article article) {
      history.push(article.save());
  }

  public void revert(Article article) {
      if (!history.isEmpty())
          article.revert(history.pop());
      else
          System.out.println("Cannot undo");


  }
}


