package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebProjectApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<html>" +
                "<head>" +
                "    <title>Ritik HUB CI/CD Demo</title>" +
                "</head>" +

                "<body style='font-family:Arial; text-align:center; background:linear-gradient(to right, #e3f2fd, #ffffff);'>" +

                "    <h1 style='color:#0d47a1;'>🚀 Ritik HUB</h1>" +
                "    <h2 style='color:#1976d2;'>Quest 3 Demo Application</h2>" +
                "    <p style='font-size:18px;'>AWS CI/CD Pipeline Demonstration</p>" +

                "    <hr style='width:60%;'>" +

                "    <h3 style='color:#2e7d32;'>🔧 CI/CD Tools Used</h3>" +

                "    <div style='display:flex; justify-content:center; flex-wrap:wrap;'>" +

                "        <div style='border:1px solid #ccc; padding:15px; margin:10px; width:200px; border-radius:10px; background:#ffffff;'>" +
                "            <h4>CodeCommit</h4>" +
                "            <p>Stores Source Code</p>" +
                "        </div>" +

                "        <div style='border:1px solid #ccc; padding:15px; margin:10px; width:200px; border-radius:10px; background:#ffffff;'>" +
                "            <h4>CodeBuild</h4>" +
                "            <p>Builds Java Application</p>" +
                "        </div>" +

                "        <div style='border:1px solid #ccc; padding:15px; margin:10px; width:200px; border-radius:10px; background:#ffffff;'>" +
                "            <h4>Amazon ECR</h4>" +
                "            <p>Stores Docker Image</p>" +
                "        </div>" +

                "        <div style='border:1px solid #ccc; padding:15px; margin:10px; width:200px; border-radius:10px; background:#ffffff;'>" +
                "            <h4>Docker</h4>" +
                "            <p>Containerizes Application</p>" +
                "        </div>" +

                "        <div style='border:1px solid #ccc; padding:15px; margin:10px; width:200px; border-radius:10px; background:#ffffff;'>" +
                "            <h4>Amazon EC2</h4>" +
                "            <p>Runs Application Container</p>" +
                "        </div>" +

                "    </div>" +

                "    <hr style='width:60%;'>" +

                "    <h3 style='color:#0d47a1;'>⚙️ CI/CD Flow</h3>" +
                "    <p style='font-size:18px;'>" +
                "        Code → Build → Docker Image → ECR → Deploy to EC2" +
                "    </p>" +

                "    <hr style='width:60%;'>" +

                "    <p style='font-size:16px; color:#555;'>✨ Powered by Ritik HUB</p>" +

                "</body>" +
                "</html>";
    }
}
