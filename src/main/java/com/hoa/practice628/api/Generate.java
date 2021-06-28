package com.hoa.practice628.api;

import com.hoa.practice628.entity.Product;
import com.hoa.practice628.entity.Sale;
import com.hoa.practice628.repository.ProductRepository;
import com.hoa.practice628.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
@RequestMapping(value = "/generate")
public class Generate {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public String generateData() {
        Product product1 = new Product();
        product1.setProdName("product1");
        product1.setDescription("description");
        product1.setDateOfManf(Calendar.getInstance().getTime());
        product1.setPrice(100000);
        Sale sale1 = new Sale();
        sale1.setDOS(Calendar.getInstance().getTime());
        sale1.setSalesmanID(1);
        sale1.setSalesmanName("hoa");
        sale1.setProduct(product1);
        product1.addSale(sale1);

        productRepository.save(product1);


        Product product2 = new Product();
        product2.setProdName("product2");
        product2.setDescription("description");
        product2.setDateOfManf(Calendar.getInstance().getTime());
        product2.setPrice(100000);
        Sale sale2 = new Sale();
        sale2.setDOS(Calendar.getInstance().getTime());
        sale2.setSalesmanID(1);
        sale2.setSalesmanName("hoa");
        sale2.setProduct(product2);
        product2.addSale(sale2);

        productRepository.save(product2);

        Product product3 = new Product();
        product3.setProdName("product3");
        product3.setDescription("description");
        product3.setPrice(100000);
        product3.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale3 = new Sale();
        sale3.setDOS(Calendar.getInstance().getTime());
        sale3.setSalesmanID(1);
        sale3.setSalesmanName("hoa");
        sale3.setProduct(product3);
        product3.addSale(sale3);

        productRepository.save(product3);

        Product product4 = new Product();
        product4.setProdName("product4");
        product4.setDescription("description");
        product4.setPrice(100000);
        product4.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale4 = new Sale();
        sale4.setDOS(Calendar.getInstance().getTime());
        sale4.setSalesmanID(1);
        sale4.setSalesmanName("hoa");
        sale4.setProduct(product4);
        product4.addSale(sale4);

        productRepository.save(product4);

        Product product5 = new Product();
        product5.setProdName("product5");
        product5.setDescription("description");
        product5.setPrice(100000);
        product5.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale5 = new Sale();
        sale5.setDOS(Calendar.getInstance().getTime());
        sale5.setSalesmanID(1);
        sale5.setSalesmanName("hoa");
        sale5.setProduct(product5);
        product5.addSale(sale5);

        productRepository.save(product5);
        Product product6 = new Product();
        product6.setProdName("product6");
        product6.setDescription("description");
        product6.setPrice(100000);
        product6.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale6 = new Sale();
        sale6.setDOS(Calendar.getInstance().getTime());
        sale6.setSalesmanID(1);
        sale6.setSalesmanName("hoa");
        sale6.setProduct(product6);
        product6.addSale(sale6);

        productRepository.save(product6);

        Product product7 = new Product();
        product7.setProdName("product7");
        product7.setDescription("description");
        product7.setPrice(100000);
        product7.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale7 = new Sale();
        sale7.setDOS(Calendar.getInstance().getTime());
        sale7.setSalesmanID(1);
        sale7.setSalesmanName("hoa");
        sale7.setProduct(product7);
        product7.addSale(sale7);

        productRepository.save(product7);

        Product product8 = new Product();
        product8.setProdName("product8");
        product8.setDescription("description");
        product8.setPrice(100000);
        product8.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale8 = new Sale();
        sale8.setDOS(Calendar.getInstance().getTime());
        sale8.setSalesmanID(1);
        sale8.setSalesmanName("hoa");
        sale8.setProduct(product8);
        product8.addSale(sale8);

        productRepository.save(product8);

        Product product9 = new Product();
        product9.setProdName("product9");
        product9.setDescription("description");
        product9.setPrice(100000);
        product9.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale9 = new Sale();
        sale9.setDOS(Calendar.getInstance().getTime());
        sale9.setSalesmanID(1);
        sale9.setSalesmanName("hoa");
        sale9.setProduct(product9);
        product9.addSale(sale9);

        productRepository.save(product9);

        Product product10 = new Product();
        product10.setProdName("product10");
        product10.setPrice(100000);
        product10.setDescription("description");
        product10.setDateOfManf(Calendar.getInstance().getTime());
        Sale sale10 = new Sale();
        sale10.setDOS(Calendar.getInstance().getTime());
        sale10.setSalesmanID(1);
        sale10.setSalesmanName("hoa");
        sale10.setProduct(product10);
        product10.addSale(sale10);
        productRepository.save(product10);


        return "generate oki";

    }
}
