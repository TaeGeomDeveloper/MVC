package gntp.lesson.service;

import gntp.lesson.dao.BookDAO;
import gntp.lesson.vo.BookVO;

public class BookService {

    public BookVO registBook(BookVO book) {
        BookVO vo = null;
        BookDAO dao = new BookDAO();

        boolean flag = dao.insertBook(book);

        if(flag) {
            vo = book;
            // 업로드 실행
            
            
        }

        return vo;
    }

}
