package com.client.proxies;

import com.client.beans.ProductBean;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "microservice-produits", url = "http://localhost:9001")
@FeignClient(name = "spring-cloud-api-gateway")


//@FeignClient(name = "zuul-server")
//@RibbonClient(name = "microservice-produits")

public interface MicroserviceProduitsProxy {
    @GetMapping(value = "/product_api/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping( value = "product_api/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);
   /*
   @GetMapping(value = "/microservice-produits/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping( value = "/microservice-produits/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

    */

}
