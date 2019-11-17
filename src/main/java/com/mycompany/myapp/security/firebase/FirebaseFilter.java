package com.mycompany.myapp.security.firebase;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirebaseFilter extends GenericFilterBean {

	private static String HEADER_NAME = "X-Authorization-Firebase";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String xAuth =((HttpServletRequest) request).getHeader(HEADER_NAME);
        if (StringUtils.isBlank(xAuth)) {
            chain.doFilter(request, response);
            return;
        } else {
            FirebaseTokenHolder holder = new FirebaseParser().parseToken(xAuth);

            String userName = holder.getUid();

            Authentication auth = new FirebaseAuthenticationToken(userName, holder);
            SecurityContextHolder.getContext().setAuthentication(auth);

            chain.doFilter(request, response);
        }
    }
}
