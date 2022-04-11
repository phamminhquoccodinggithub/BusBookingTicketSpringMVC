/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.handlers;

import com.mycompany.pojo.Account;
import com.mycompany.service.AccountService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 *
 * @author Quoc
 */
@Component
public class LoginSuccessHandlers implements AuthenticationSuccessHandler{
    @Autowired
    private AccountService accountService;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication a) throws IOException, ServletException {
        Account account = this.accountService.getAccountByUserName(a.getName());
        request.getSession().setAttribute("currentUser", account);
        response.sendRedirect("/A3SpringMVCDemo/");
    }
    
}
