package com.mproduits;

import com.mproduits.dao.ProductDao;
import com.mproduits.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class DataInit implements CommandLineRunner {
    ProductDao productDao;
    @Override
    public void run(String... args) throws Exception {

     productDao.save(new Product(null, "Bougie fonctionnant au feu", "bougie qui fonctionne comme une ampoule mais sans électricité !", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Bougie.PNG?raw=true", 22.0));
     productDao.save(new Product(null, "Chaise pour s''assoire", "Chaise rare avec non pas 1 ni 2 mais 3 pieds", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Chaise.PNG?raw=true", 95.0));
     productDao.save(new Product(null, "Cheval pour nains", "Ce cheval ne portera certainement pas blanche neige, mais sans problème les nains", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Cheval.PNG?raw=true", 360.0));
     productDao.save(new Product(null, "Cheval nadzi", "Ce cheval ne portera certainement pas blanche neige, mais sans problème les nains", "https://github.com/OpenClassrooms-Student-Center/4668216-Optimisez-votre-architecture-Microservices/blob/master/images/Cheval.PNG?raw=true", 361.0));
     log.info("done !!!!!!!!!!!!!!!!!!!!!!");
    }
}
