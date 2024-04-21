package rest;


import com.workintech.S17D2.model.Developer;
import com.workintech.S17D2.tax.DeveloperTax;
import com.workintech.S17D2.tax.Taxable;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(path = "/developers")
public class DeveloperController {

    public Map<Integer, Developer> developers;

    private Taxable taxable;

    @Autowired
    public DeveloperController(DeveloperTax taxable) {
        this.taxable = taxable;
    }


    @PostConstruct
    public void init() {
        developers = new HashMap<>();
    }




}

