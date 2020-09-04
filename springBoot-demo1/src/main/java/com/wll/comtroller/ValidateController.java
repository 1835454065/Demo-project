package com.wll.comtroller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@RestController
//校验注解
@Validated
public class ValidateController {
    @RequestMapping("/valid1")
    public String message(@NotBlank(message = "group不能为空")@RequestParam String group,@NotBlank(message = "email不能为空") @Email(message = "邮箱格式非法") @RequestParam String email){
        return group + "：" + email;
    }
}
