package homework;

import java.util.HashSet;

public class BookDemo {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<>();
        Book b1=new Book("骆驼祥子","老舍",28);
        Book b2=new Book("狂人日记","鲁迅",25);
        Book b3=new Book("鲁滨逊漂流记","笛福",23);
        Book b4=new Book("骆驼祥子","老舍",28);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        for (Book book : set) {
            System.out.println("书名:"+book.getTitle()+",作者:"+book.getAuthor()+",价格:"+book.getPrice());
        }
    }
}
