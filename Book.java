class Book {
    String boname = "Ramayanam";
    String boauthor = "Valmiki";
    double boprice = 2500.48;

    public void getBookInfo() {
        System.out.println("book name is: " + boname);
        System.out.println("book author is: " + boauthor);
        System.out.println("book price is: " + boprice);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.getBookInfo();
    }
}