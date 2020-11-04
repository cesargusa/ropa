package com.example.Ropa.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.Ropa.Model.Ropa;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RopaController {

    public ArrayList<Ropa> ropas = new ArrayList<Ropa>(Arrays.asList(new Ropa("1",
            "Sudadera Grimey Ubiquity Hoodie FW20 Yellow", "Amarilla", "XL",
            "https://store.grimey.es/media/catalog/product/cache/1/image/1250x/040ec09b1e35df139433887a97daa66f/g/c/gch476-ylw_sudadera_grimey_ubiquity_hoodie_fw20_yellow_01.jpg"),
            new Ropa("2", "Sudadera Grimey yoga Fire Hoodie FW20 Black", "Negra", "S",
                    "https://store.grimey.es/media/catalog/product/cache/1/image/1250x/040ec09b1e35df139433887a97daa66f/s/u/sudadera_grimey_yoga_fire_fw20_black_01_1.jpg"),
            new Ropa("3", "Bañador Grimey Yanga Leopard SS20 Green", "Verde", "M",
                    "https://store.grimey.es/media/catalog/product/cache/1/image/1250x/040ec09b1e35df139433887a97daa66f/b/a/ba_ador_grimey_yanga_leopard_ss20_green_11.jpg"),
            new Ropa("4", "Pantalón Grimey Arch Rival FW20 Red", "Rojo", "XL",
                    "https://store.grimey.es/media/catalog/product/cache/1/image/1250x/040ec09b1e35df139433887a97daa66f/g/r/grts188-red_pantal_n_grimey_arch_rival_fw20_red_02.jpg"),
            new Ropa("5", "Chaqueta Reversible Grimey Acknowledge SS20 Silver/Black", "Blanco", "XXL",
                    "https://store.grimey.es/media/catalog/product/cache/1/image/1250x/040ec09b1e35df139433887a97daa66f/g/p/gpvj110_chaqueta_reversible_grimey_acknowledge_ss20_black_08_1.jpg")

    ));

    // METHOD GET
    @GetMapping("/Ropas")
    public ArrayList<Ropa> GetAllRopa() {
        return ropas;
    }

    // METHOD GET/{ID}
    @GetMapping("/Ropas/{id}")
    public Ropa FindById(@PathVariable("id") String id) {
        for (Ropa element : ropas) {
            if (element.getId().equals(id))
                return element;
        }
        return null;
    }

    // METHOD POST
    @PostMapping("/Ropas")
    public Ropa Add(@RequestBody Ropa NewRopa) {
        ropas.add(NewRopa);
        return NewRopa;
    }

    // METHOD PUT
    @PutMapping("/Ropas/{id}")
    public Ropa Update(@RequestBody Ropa UpdateRopa, @PathVariable("id") String id) {
        for (Ropa element : ropas) {
            if (element.getId().equals(id)) {
                element.setId(UpdateRopa.getId());
                element.setName(UpdateRopa.getName());
                element.setColor(UpdateRopa.getColor());
                element.setSize(UpdateRopa.getSize());
                element.setImage(UpdateRopa.getImage());
                return element;
            }

        }
        return null;

    }

    // METHOD DELETE
    @DeleteMapping("Ropas/{id}")
    public void Delete(@PathVariable("id") String id) {
        for (Ropa element : ropas) {
            if (element.getId().equals(id)) {
                ropas.remove(element);
                break;
            }

        }
    }

}
