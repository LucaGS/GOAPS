package GastroOrderAndPaySystem.GOAPS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import GastroOrderAndPaySystem.GOAPS.model.Product;
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
      @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct"; // loads addProduct.html
    }
     @PostMapping("/products")
    public String addProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/";
    }
}
