package com.hoa.practice628.controller;

import com.hoa.practice628.repository.ProductRepository;
import com.hoa.practice628.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class ViewController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public String index(Model model){
        model.addAttribute("listProduct",productRepository.findAll());
        model.addAttribute("listSale",saleRepository.findAll());
        return "index";
    }

}
