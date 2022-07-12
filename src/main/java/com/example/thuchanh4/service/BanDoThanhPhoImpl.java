package com.example.thuchanh4.service;

import com.example.thuchanh4.model.BanDoThanhPho;
import com.example.thuchanh4.repository.BanDoThanhPhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BanDoThanhPhoImpl implements BanDoThanhPhoService{
    @Autowired
    BanDoThanhPhoRepository banDoThanhPhoRepository;

    @Override
    public Iterable<BanDoThanhPho> findAll() {
        return banDoThanhPhoRepository.findAll();
    }

    @Override
    public Optional<BanDoThanhPho> findById(Long id) {
        return banDoThanhPhoRepository.findById(id);
    }

    @Override
    public BanDoThanhPho save(BanDoThanhPho banDoThanhPho) {
        return banDoThanhPhoRepository.save(banDoThanhPho);
    }

    @Override
    public void remove(Long id) {
        banDoThanhPhoRepository.deleteById(id);
    }
}
