/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.muarine.mail;

import com.muarine.example.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * com.muarine.mail.TestMail
 *
 * @author Muarine<maoyun0903@163.com>
 * @date 16/10/8
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class TestMail {

    @Autowired
    private JavaMailSender mailSender;


    @Test
    public void sendSimpleMail() throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("xxx@xx.com");
        message.setTo("xxx@xx.com");
        message.setSubject("主题：Test");
        message.setText("Test Content");
        mailSender.send(message);
    }


    @Test
    public void sendAttachmentsMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("dyc87112@qq.com");
        helper.setTo("dyc87112@qq.com");
        helper.setSubject("主题：有附件");
        helper.setText("有附件的邮件");
        FileSystemResource file = new FileSystemResource(new File("weixin.jpg"));
        helper.addAttachment("附件-1.jpg", file);
        helper.addAttachment("附件-2.jpg", file);
        mailSender.send(mimeMessage);
    }


    @Test
    public void sendTemplateMail(){



    }

}
