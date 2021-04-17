package com.springmvc.interceptor.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class RestTestController {


    @RequestMapping(value = "test", method = RequestMethod.PUT)
    public String test(Book book, Map<String, Object> map, HttpSession session) {
        System.out.println(book);
        System.out.println("test" + map.hashCode());
        return "success";
    }

    @ModelAttribute
    public void testModelAttribute(Map<String, Object> map) {
        Book book = new Book();
        book.setName("aaa");
        book.setPages(12);
        System.out.println("testModelAttribute" + map.hashCode());
        map.put("book", book);
    }


    @RequestMapping(value = "book/{bid}", method = RequestMethod.GET)
    public String getBook(@PathVariable(name = "bid") String bid) {
        System.out.println("get book");
        return "success";
    }
    @RequestMapping(value = "book/{bid}", method = RequestMethod.PUT)
    public String updateBook(@PathVariable(name = "bid") String bid) {
        System.out.println("update book");
        return "success";
    }
    @RequestMapping(value = "book/{bid}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable(name = "bid") String bid) {
        System.out.println("delete book");
        return "success";
    }
    @RequestMapping(value = "book/{bid}", method = RequestMethod.POST)
    public String addBook(@PathVariable(name = "bid") String bid) {
        System.out.println("add book");
        return "success";
    }
}
