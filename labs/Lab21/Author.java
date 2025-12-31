package Lab21;

public class Author {
    private String name;
    private String email;
    private Book book;

    public Author(){

    }

    public Author(String name, String email, Book book){
        this.name = name;
        this.email = email;
        this.book = book;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Book getBook(){
        return this.book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public String toString(){
        return "Author: " + "\nName = " + this.name + "\nEmail = " + this.email + "\n•" + book.toString();
    }

    public boolean equals(Object o){
        if(o instanceof Author){
            Author g = (Author)o;
            return (this.book.equals(g.getBook()) && this.name.equals(g.name) && this.email.equals(g.getEmail()));
        }
        else return false;
    }
}
