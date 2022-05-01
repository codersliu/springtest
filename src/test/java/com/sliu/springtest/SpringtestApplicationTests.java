package com.sliu.springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringtestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void simEmail(){
        //简单邮件
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //邮件主题
        mailMessage.setSubject("简单邮件测试-codersliu");
        //邮件正文
        mailMessage.setText("你好啊，csusliu，万事胜意！");
        //邮件接收方
        mailMessage.setTo("shunliu@csu.edu.cn");
        //邮件发送方
        mailMessage.setFrom("1653698757@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void compEmail() throws MessagingException {
        //复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装,开启多附件上传
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        //正文
        helper.setSubject("复杂邮件测试-codersliu");
        //开启html格式
        helper.setText("<p style='color:red'>你好啊，csusliu，万事胜意~</p>",true);

        //附件，开启了多附件上传
        helper.addAttachment("1109233.jpg", new File("C:\\Users\\Administrator\\Pictures\\1109233.jpg"));
        helper.addAttachment("CHNN.vsdx", new File("C:\\Users\\Administrator\\Desktop\\CHNN.vsdx"));

        helper.setTo("shunliu@csu.edu.cn");
        helper.setFrom("1653698757@qq.com");

        mailSender.send(mimeMessage);
    }

}
