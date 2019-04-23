package com.example.post_horse.controller;

import com.example.post_horse.pojo.Book;
import com.example.post_horse.service.BookService;
import com.example.post_horse.utils.SzpJsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-21 16:10
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    //通过userId寻找订单，返回已经评价的list
    @ApiOperation("通过userId寻找订单，返回已经评价的list")
    @GetMapping("/findBooksByUserIdAndCommonsIsNotNull.action")
    public SzpJsonResult findBooksByUserIdAndCommonsIsNotNull(long userId){
        List<Book> booksByUserIdAndCommonsIsNotNull = bookService.findBooksByUserIdAndCommonsIsNotNull(userId);
        return SzpJsonResult.ok(booksByUserIdAndCommonsIsNotNull);
    }
    @ApiOperation("显示所有订单")
    @GetMapping("/getAllBooks.action")
    public SzpJsonResult findAllBooks( HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Book> allBooks = bookService.findAllBooks();
        return SzpJsonResult.ok(allBooks);
    }
    @ApiOperation("通过id删除订单")
    @DeleteMapping("/deleteBookById.action")
    public SzpJsonResult deleteBookById(@RequestBody long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bookService.deleteBookById(id);
        return SzpJsonResult.ok();
    }

    /**
     * @param book
     * @return Book
     * @Description:添加订单时，客户端不生成订单编号(stringId)
     * stringId由服务器端UUID生成
     *
     */
    @ApiOperation("添加订单")
    @PostMapping("/insertBook.action")
    public SzpJsonResult insertBook(@RequestBody Book book, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        String string= UUID.randomUUID().toString();
        String string1="";
        char[] chars = string.toCharArray();
        for (int i=0;i<15;i++){
            string1+=chars[i];
        }
        book.setStringId(string1);
        bookService.insertBook(book);
        List<Book> bookByStringId = bookService.findBookByStringId(string);
        return SzpJsonResult.ok(bookByStringId);
    }

    /**
     *
     * @param book
     * @return
     */
    @ApiOperation("更新订单，如果订单id进行更新，更新值部位null的字段")
    @PutMapping("/updateBookById.action")
    public SzpJsonResult updateBookById(@RequestBody Book book, HttpServletResponse response){

        Book bookById = bookService.findBookById(book.getId());
        book.setUserId(bookById.getUserId());
        book.setCompanyId(bookById.getCompanyId());
        bookService.updateBookById(book);

        return SzpJsonResult.ok(bookById);
    }


    //通过订单id查找订单
    @ApiOperation("通过id找到订单")
    @GetMapping("/findBookById.action")
    public SzpJsonResult findBookById(long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Book bookById = bookService.findBookById(id);
        return SzpJsonResult.ok(bookById);
    }
    //通过订单编号stringId查找订单
    @ApiOperation("通过stringId找到订单")
    @GetMapping("/findBookByStringId.action")
    public SzpJsonResult findBookByStringId(String stringId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Book> bookByStringId = bookService.findBookByStringId(stringId);
        return SzpJsonResult.ok(bookByStringId);
    }
    //通过userId寻找订单，返回list
    @ApiOperation("通过userId寻找订单，返回list")
    @GetMapping("/findBooksByUserId.action")
    public SzpJsonResult findBooksByUserId(long userId, HttpServletResponse response){
        List<Book> booksByUserId = bookService.findBooksByUserId(userId);
        return SzpJsonResult.ok(booksByUserId);
    }
    //通过companyId寻找订单,返回list
    @ApiOperation("通过companyId(公司表中的主键id）寻找订单,返回list")
    @GetMapping("/findBooksByCompanyId.action")
    public SzpJsonResult findBooksByCompanyId(long companyId, HttpServletResponse response){
        List<Book> booksByCompanyId = bookService.findBooksByCompanyId(companyId);
        return SzpJsonResult.ok(booksByCompanyId);
    }
    //通过companyName寻找订单，返回list
    @ApiOperation("通过companyName寻找订单，返回list")
    @GetMapping("/findBooksByCompanyName.action")
    public SzpJsonResult findBooksByCompanyName(String companyName, HttpServletResponse response){
        List<Book> booksByCompanyName = bookService.findBooksByCompanyName(companyName);
        return SzpJsonResult.ok(booksByCompanyName);
    }
    //通过customerName寻找订单，返回list
    @ApiOperation("通过customerName寻找订单，返回list")
    @GetMapping("/findBooksByCustomerName.action")
    public SzpJsonResult findBooksByCustomerName(String customerName, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Book> booksByCustomerName = bookService.findBooksByCustomerName(customerName);
        return SzpJsonResult.ok(booksByCustomerName);
    }
    //通过是否已评级review寻找订单，返回list
    @ApiOperation("通过是否已评级review寻找订单，返回list")
    @GetMapping("/findBooksByReview.action")
    public SzpJsonResult findBooksByReview(String review, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Book> booksByReview = bookService.findBooksByReview(review);
        return SzpJsonResult.ok(booksByReview);
    }
}
