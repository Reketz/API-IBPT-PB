package br.com.ibpt.apiibpt.controller;

import br.com.ibpt.apiibpt.repository.IbptRepository;
import br.com.ibpt.apiibpt.model.Ibpt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/apiibpt")
//@Api(value="API REST IBPT")
@CrossOrigin(origins = "*")
public class IbptController {
    
    @Autowired
    IbptRepository ibptRepository;
    
//    @ApiOperation(value = "Retorna o imposto sobre a valor informado")
    @GetMapping("/getImposto/{codigo}/{uf}/{valor}") 
    public Ibpt getImposto(@PathVariable() String codigo, @PathVariable() String uf, @PathVariable() BigDecimal valor){
        Ibpt ibpt = ibptRepository.findByCodigoAndUf(codigo, uf);
        if(ibpt != null){
            ibpt.setValor(valor);
            ibpt.setValorTributoEstadual(calculateValor(ibpt.getEstadual(), valor));
            ibpt.setValorTributoImportado(calculateValor(ibpt.getImportadosfederal(), valor));
            ibpt.setValorTributoMunicipal(calculateValor(ibpt.getMunicipal(), valor));
            ibpt.setValorTributoNacional(calculateValor(ibpt.getNacionalfederal(), valor));
        }
        return ibptRepository.findByCodigoAndUf(codigo, uf);
    }
    
    public BigDecimal calculateValor(BigDecimal parcent, BigDecimal total) {        
        return parcent.multiply(total).divide(BigDecimal.TEN.multiply(BigDecimal.TEN), RoundingMode.UP);
    }
    
    /*@ApiOperation(value = "Retorna uma lista com todos os IBPT")
    @GetMapping("/list")
    public List<Ibpt> listar(){
        return ibptRepository.findAll();
    }    
    
    @ApiOperation(value = "Retorna um ibpt pelo codigo")
    @GetMapping("/get/{id}")
    public Ibpt get(@PathVariable(value = "id") long id){
        return ibptRepository.findById(id);
    }
    
    @ApiOperation(value = "Adiciona um ibpt")
    @PostMapping("/add")
    public Ibpt add(@RequestBody Ibpt ibpt){
        return ibptRepository.save(ibpt);
    }
    
    @ApiOperation(value = "Deleta um ibpt")
    @DeleteMapping("/delete")
    public void delete(@RequestBody Ibpt ibpt){
        ibptRepository.delete(ibpt);
    }
    
    @ApiOperation(value = "Altera um ibpt")
    @PutMapping("/alter")
    public Ibpt alter(@RequestBody Ibpt ibpt){
        return ibptRepository.save(ibpt);
    }*/
    
}
