package com.example.thuchanh4.controller;


import com.example.thuchanh4.model.BanDoThanhPho;
import com.example.thuchanh4.service.BanDoThanhPhoImpl;
import com.example.thuchanh4.service.BanDoThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/bandothanhphos")

public class BanDoThanhPhoController {
    @Autowired
    BanDoThanhPhoService banDoThanhPhoService;

    @GetMapping  //hien thi
    public ResponseEntity<BanDoThanhPho> hienTatCaBanDoThanhPho() {
        return new ResponseEntity(banDoThanhPhoService.findAll(), HttpStatus.OK);
    }

    @PostMapping
//    @valid de duyet qua validate
    public ResponseEntity<BanDoThanhPho> add(@RequestBody BanDoThanhPho banDoThanhPho) {
        banDoThanhPhoService.save(banDoThanhPho);
        return new ResponseEntity(banDoThanhPhoService, HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity<BanDoThanhPho> findById( @PathVariable Long id) {
        return new ResponseEntity(banDoThanhPhoService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")           //Chỉnh sửa theo id
    public ResponseEntity capNhatBanDoThanhPho(@RequestBody BanDoThanhPho banDoThanhPho, @PathVariable Long id) {
        Optional<BanDoThanhPho> banDoThanhPho1Optional = banDoThanhPhoService.findById(id);
        if (!banDoThanhPho1Optional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        banDoThanhPho.setId(banDoThanhPho1Optional.get().getId());
        banDoThanhPhoService.save(banDoThanhPho);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")     // xoa
    public ResponseEntity<BanDoThanhPho> deleteTransaction(@PathVariable Long id) {
        Optional<BanDoThanhPho> banDoThanhPhoOptional = banDoThanhPhoService.findById(id);
        if (!banDoThanhPhoOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        banDoThanhPhoService.remove(id);
        return new ResponseEntity<>(banDoThanhPhoOptional.get(), HttpStatus.NO_CONTENT);
    }

}
