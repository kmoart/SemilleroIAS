package co.com.ias.training.Clase7DeMarzo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoriasController {

    // @GetMapping(/index)"
    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String mostrarIndex(Model model){
        return "categorias/listProductos";
    }

    // @GetMapping("/create")
    @RequestMapping(value="/create", method=RequestMethod.GET)
    public String crear(){
        return "categorias/formProducto";
    }

    // @PostMappging("/save")
    @RequestMapping(value="/save", method=RequestMethod.POST)
    public String Guardar(){
        return "categorias/listProductos";
    }

    // @PostMappging("/update")
    @RequestMapping(value="/update", method=RequestMethod.PUT)
    public String Actualizar(){
        return "categorias/listProductos";
    }

    // @PostMappging("/delete")
    @RequestMapping(value="/delete", method=RequestMethod.PUT)
    public String Eliminar(){
        return "categorias/listProductos";
    }
}
