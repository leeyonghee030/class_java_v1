package comoop15;

public class LibraryMainTest {

    public static void main(String[] args) {
        // 책 객체를 밖에서 먼저 실핼한다 (독립적)
        Book book1 = new Book("자바의 정석");
        Book book2 = new Book("이펙트브 자바");

        //도서관을 만들고 책을 넣을수 있다
        Library library = new Library(5);

        library.addBook(book1);
        library.addBook(book2);
        library.showInfo();

        System.out.println("----도서관 폐관");
        //도서관 객체를 가리키던 참조를 끊는다
        //주의 : 이 순간 객체가 사라지는 것이 아니라 , GC의 수거 대상이 될뿐이다
        //GC 가비지 컬랙션?
        //heap 라는 메모리안에 여러개 객체가잏다고 상황을 보고
        //다른 메모리에서 가리키는 관계가없을떄 heap에서 객체 메모리를 내린다?
        library = null;


        //도서관은 사라졌지만 (가정) b1과 b2 는 여전히 살아있다
        //즉 book1 ,book2 변수가 각  Book객체를 붙잘고 있기 떄문에  GC 대상이 안된다
//        library.showInfo();
        book1.display();
        book2.display();

    }

}
