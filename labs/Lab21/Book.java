package Lab21;

public class Book {
    private String title;
    private double price;

    public Book(){

    }

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return "Book: " + "\nTitle = " + this.getTitle() + "\nPrice = " + this.price + "$";
    }

    public boolean equals(Object o){
        if(o instanceof Book){
            Book g = (Book)o;
            return (g.getTitle().equals(this.title) && g.getPrice() == this.price);
        }
        else return false;
    }

    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Animal Farm", 5);

        Author a1 = new Author("Shakespear", "shakespear@gmail.com", b1);
        Author a2 = new Author("Willian Golding", "golding@gmail.com", b2);

        System.out.println(b1);
        System.out.println();
        System.out.println(b2);
        System.out.println();
        System.out.println(b1.equals(b2));
        System.out.println();
        System.out.println(a1);
        System.out.println();
        System.out.println(a2);
        System.out.println();
        System.out.println(a1.equals(a2));
    }
}
