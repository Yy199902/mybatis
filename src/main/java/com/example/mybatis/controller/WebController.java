package com.example.mybatis.controller;


import com.example.mybatis.dao.VerifyCodeUtils;

import java.io.*;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class WebController {

    @GetMapping("/time")
    public void time(){
            throw new RuntimeException();
    }

    @GetMapping(value="/imgs")
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机大写字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        // 存入会话session
        HttpSession session = request.getSession(true);
        // 删除以前的
        session.removeAttribute("verCode");
        session.removeAttribute("codeTime");
        session.setAttribute("verCode", verifyCode.toLowerCase());
        session.setAttribute("codeTime", new Date());
        // 生成图片
        int w = 100, h = 30;
        OutputStream out = response.getOutputStream();
        VerifyCodeUtils.outputImage(w, h, out, verifyCode);
    }

    @RequestMapping("/readPartImage")
    @ResponseBody
    public void readPartImage(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String path = request.getParameter("url");
        File file = new File("F:\\xiangmu\\mybatis\\src\\main\\java\\com\\example\\mybatis\\controller\\hh.jpg");
        InputStream is = new FileInputStream(file);
        byte[] bytes = new byte[is.available()];
        is.read(bytes);
        is.close();
        //ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream os = response.getOutputStream();
       /*int ch = 0;
       while (-1 != (ch = is.read())){
           os.write(bytes,0,ch);
       }*/
        response.setContentType("image/*");
        os.write(bytes);
        os.close();
    }

    @RequestMapping("/upload")
    public void uploadFile(HttpServletRequest request, HttpServletResponse response) throws IOException{
          File file = new File("F:\\xiangmu\\mybatis\\src\\main\\java\\com\\example\\mybatis\\controller\\hh.jpg");
        FileInputStream fis;
        fis = new FileInputStream(file);

        long size = file.length();
        byte[] temp = new byte[(int) size];
        fis.read(temp, 0, (int) size);
        fis.close();
        byte[] data = temp;
        response.setContentType("image/png");
        OutputStream out = response.getOutputStream();
        out.write(data);
        out.flush();
        out.close();

    }

}
