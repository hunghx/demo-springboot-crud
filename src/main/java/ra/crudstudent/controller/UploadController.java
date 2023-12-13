package ra.crudstudent.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ra.crudstudent.service.UploadService;

@RestController
@RequiredArgsConstructor
public class UploadController {
    private final UploadService uploadService;
    @PostMapping("/upload")
    public  String upload(@RequestParam("file")MultipartFile file){
        return uploadService.uploadFileToServer(file);
    }
}
