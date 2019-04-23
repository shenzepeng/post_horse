package com.example.post_horse.service;

import com.example.post_horse.mapper.BookMapper;
import com.example.post_horse.pojo.Book;
import com.example.post_horse.pojo.BookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 18:04
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public void deleteBookById(long id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertBook(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void updateBookById(Book book) {
        bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public Book findBookById(long id) {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }

    @Override
    public List<Book> findBookByStringId(String stringId) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andStringIdEqualTo(stringId);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByUserId(long userId) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andUserIdEqualTo(userId);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByUserIdAndCommonsIsNotNull(long userId) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andUserIdEqualTo(userId).andEvaluateContentIsNotNull().andEvaluateContentNotEqualTo("");
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByCompanyId(long companyId) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andCompanyIdEqualTo(companyId);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByCompanyName(String companyName) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andCompanyNameEqualTo(companyName);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByCustomerName(String customerName) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andCustomerNameEqualTo(customerName);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findBooksByReview(String review) {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria().andReviewEqualTo(review);
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }

    @Override
    public List<Book> findAllBooks() {
        BookExample bookExample=new BookExample();
        bookExample.createCriteria()
                .getAllCriteria();
        List<Book> books = bookMapper.selectByExample(bookExample);
        return books;
    }
}
