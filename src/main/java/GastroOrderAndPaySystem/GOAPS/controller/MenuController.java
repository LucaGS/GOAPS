package GastroOrderAndPaySystem.GOAPS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import GastroOrderAndPaySystem.GOAPS.repository.ProductRepository;

@Controller
public class MenuController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String showMenu(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "menu"; // Loads templates/menu.html
    }
}
