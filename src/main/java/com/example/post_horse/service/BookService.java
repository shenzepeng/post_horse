package com.example.post_horse.service;

import com.example.post_horse.pojo.Book;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 15:20
 * @Description: 沈泽鹏写点注释吧
 */
public interface BookService {
    void deleteBookById(long id);
    void insertBook(Book book);
    void updateBookById(Book book);
    //通过订单id查找订单
    Book findBookById(long id);
    //通过订单编号stringId查找订单
    List<Book> findBookByStringId(String stringId);
    //通过userId寻找订单，返回list
    List<Book> findBooksByUserId(long userId);
    //通过userId寻找订单，返回已经评价的list
    List<Book> findBooksByUserIdAndCommonsIsNotNull(long userId);
    //通过companyId寻找订单,返回list
    List<Book> findBooksByCompanyId(long companyId);
    //通过companyName寻找订单，返回list
    List<Book> findBooksByCompanyName(String companyName);
    //通过customerName寻找订单，返回list
    List<Book> findBooksByCustomerName(String customerName);
    //通过是否已评级review寻找订单，返回list
    List<Book> findBooksByReview(String review);
    //显示所有订单
    List<Book> findAllBooks();

}
