package com.example.mybatis.controller;

import com.example.mybatis.service.DaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@Controller
public class CurdController {

    private ConcurrentHashMap<String, DaoService> map =new ConcurrentHashMap<>();
    public CurdController(List<DaoService> daoServiceList){
        for (DaoService daoService : daoServiceList) {
            map.put(daoService.getCrudType(),daoService);
        }
    }

    @GetMapping("/crud")
    public void curd(HttpServletResponse response) throws IOException {
//      return "index";
        response.sendRedirect("http://yinsi.hdrgame.com/index.html");
    }
    @GetMapping("/index")
    public String index(HttpServletResponse response) throws IOException {
      return "index";
//        response.sendRedirect("http://yinsi.hdrgame.com/index.html");
    }

}
