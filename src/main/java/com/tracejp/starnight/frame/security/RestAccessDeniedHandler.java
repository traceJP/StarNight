package com.tracejp.starnight.frame.security;

import com.tracejp.starnight.entity.enums.SystemCodeEnum;
import com.tracejp.starnight.utils.ServletUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p> 权限拦截响应 <p/>
 *
 * @author traceJP
 * @since 2023/5/24 21:16
 */
@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        SystemCodeEnum code = SystemCodeEnum.AccessDenied;
        ServletUtils.renderString(response, code.getCode(), code.getMessage());
    }

}
